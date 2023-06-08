package com.chatmap.chats.impl.ui

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.chatmap.chats.impl.ui.components.ChatItem
import com.chatmap.common.ui.theme.ApplicationTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun ChatsScreen(viewModel: ChatsViewModel) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        when (val state = viewModel.uiState) {
            is ChatViewState.Loading -> {
                CircularProgressIndicator()
            }

            is ChatViewState.Success -> {
                val query by viewModel.displayedSearchQuery.collectAsStateWithLifecycle(initialValue = "")
                val users by viewModel.chats.collectAsStateWithLifecycle(initialValue = "")

                var active by rememberSaveable { mutableStateOf(false) }

                Log.e("DEBUG", query)
                SearchBar(
                    query = query,
                    onQueryChange = viewModel::onQueryUpdate,
                    onSearch = { active = false },
                    active = active,
                    onActiveChange = {
                        active = it
                    },
                ) {
                    LazyColumn {

                    }
                }

                LazyColumn {
                    items(5) {
                        ChatItem(image = "")
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun ChatsScreenPreview() {
    ApplicationTheme {
        ChatsScreen(viewModel = ChatsViewModel().apply {
            accessUiState = ChatViewState.Success
        })
    }
}
