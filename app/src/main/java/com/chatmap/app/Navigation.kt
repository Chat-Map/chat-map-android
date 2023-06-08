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
import com.chatmap.app.ui.BottomBar
import com.chatmap.auth.api.AuthEntry
import com.chatmap.chats.api.ChatsEntry
import com.chatmap.common.find

@Composable
internal fun Navigation() {
    val navController = rememberNavController()
    val destinations = LocalAppProvider.current.destinations

    val chatsScreen = destinations.find<ChatsEntry>()
    val authScreen = destinations.find<AuthEntry>()

    Box(modifier = Modifier.fillMaxSize()) {
        NavHost(navController = navController, startDestination = authScreen.featureRoute) {
            with(authScreen) {
                navigation(navController, destinations)
            }
            with(chatsScreen) {
                composable(navController, destinations)
            }
        }
    }

    Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.BottomCenter) {
        BottomBar(navController, destinations)
    }
}
