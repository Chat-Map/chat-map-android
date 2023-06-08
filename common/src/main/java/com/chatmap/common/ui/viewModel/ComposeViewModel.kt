package com.chatmap.common.ui.viewModel

import androidx.activity.OnBackPressedCallback
import com.chatmap.common.ui.viewState.ViewState
import com.chatmap.common.ui.viewState.IllegalViewStateException
import java.util.ArrayDeque

abstract class ComposeViewModel<VS : ViewState> : BaseViewModel() {

    abstract var uiState: VS
        protected set

    var accessUiState: VS
        get() = uiState
        set(value) {
            // TODO: check runtime execution.
            uiState = value
        }

    protected inline fun <reified VS> withViewState(block: (VS) -> Unit) {
        val currentViewState = uiState

        if (currentViewState is VS) block(currentViewState) else throw IllegalViewStateException(
            currentViewState
        )
    }


    private val viewStateStack = ArrayDeque<VS>()

    private val onBackPressedCallbackDelegate = lazy {
        object : OnBackPressedCallback(false) {
            override fun handleOnBackPressed() {
                restoreFromBackStack()
            }
        }
    }

    val onBackPressedCallback by onBackPressedCallbackDelegate

    private fun changeOnBackPressedCallbackEnabled() {
        if (viewStateStack.isEmpty()) {
            onBackPressedCallback.isEnabled = false
        }
    }

    private val hasOnBackPressedCallback: Boolean
        get() = onBackPressedCallbackDelegate.isInitialized()

    fun saveToBackStack(viewState: VS) {
        if (hasOnBackPressedCallback) {
            viewStateStack.push(viewState)
            onBackPressedCallback.isEnabled = true
        }
    }

    fun removeFromBackStackWithout() {
        viewStateStack.pop()

        changeOnBackPressedCallbackEnabled()
    }

    private fun restoreFromBackStack() {
        uiState = viewStateStack.pop()

        changeOnBackPressedCallbackEnabled()
    }
}
