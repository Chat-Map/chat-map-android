package com.chatmap.chats.impl

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import com.chatmap.api.LocalDataProvider
import com.chatmap.chats.api.ChatsEntry
import com.chatmap.chats.impl.di.DaggerChatsComponent
import com.chatmap.chats.impl.ui.ChatsScreen
import com.chatmap.common.Destinations
import com.chatmap.common.di.LocalCommonProvider
import com.chatmap.common.di.injectedViewModel
import javax.inject.Inject

class ChatsEntryImpl @Inject constructor() : ChatsEntry() {

    @Composable
    override fun Composable(
        navController: NavHostController,
        destinations: Destinations,
        backStackEntry: NavBackStackEntry
    ) {

        val dataProvider = LocalDataProvider.current
        val commonProvider = LocalCommonProvider.current

        val viewModel = injectedViewModel {
            DaggerChatsComponent.factory().create(commonProvider, dataProvider).viewModel
        }

        ChatsScreen(viewModel = viewModel)
    }
}
