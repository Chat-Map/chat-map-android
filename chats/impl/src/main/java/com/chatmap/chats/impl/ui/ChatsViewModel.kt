package com.chatmap.chats.impl.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.chatmap.chats.impl.GetChatsUseCase
import com.chatmap.common.ui.viewModel.ComposeViewModel
import com.chatmap.common.ui.viewState.ViewState
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

sealed class ChatViewState : ViewState {
    object Loading : ChatViewState()
    object Success : ChatViewState()
}

class ChatsViewModel @Inject constructor(
    private val getChatsUseCase: GetChatsUseCase
) : ComposeViewModel<ChatViewState>() {

    init {
        launch {
            getChatsUseCase()
        }
    }

    override var uiState: ChatViewState by mutableStateOf(ChatViewState.Success)

    private var query: String? = null

    private val searchQueryFlow = MutableSharedFlow<String?>(replay = 1)
    val displayedSearchQuery: Flow<String> = searchQueryFlow.map { it.orEmpty() }

    @OptIn(FlowPreview::class, ExperimentalCoroutinesApi::class)
    val _chats = searchQueryFlow
        .onEach { query = it }
        .debounce { 300L }
//        .flatMapLatest { }

    val chats = _chats

    fun onQueryUpdate(newQuery: String) {
        withViewState<ChatViewState.Success> {
            searchQueryFlow.tryEmit(newQuery)
        }
    }
}
