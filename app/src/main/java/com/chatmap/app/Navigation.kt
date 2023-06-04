package com.chatmap.app

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.chatmap.app.di.LocalAppProvider
import com.chatmap.app.ui.BottomMenuBar
import com.chatmap.chats.api.ChatsEntry
import com.chatmap.common.find

@Composable
internal fun Navigation() {
    val navController = rememberNavController()
    val destinations = LocalAppProvider.current.destinations

    val chatsScreen = destinations.find<ChatsEntry>()

    Box(modifier = Modifier.fillMaxSize()) {
        NavHost(navController = navController, startDestination = chatsScreen.featureRoute) {
            with(chatsScreen) {
                composable(navController, destinations)
            }
        }
    }

    Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.BottomCenter) {
        BottomMenuBar(navController, destinations)
    }
}
