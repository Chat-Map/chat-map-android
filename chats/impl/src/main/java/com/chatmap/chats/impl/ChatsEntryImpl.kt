package com.chatmap.chats.impl

import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.chatmap.chats.api.ChatsEntry
import com.chatmap.common.Destinations
import javax.inject.Inject

class ChatsEntryImpl @Inject constructor() : ChatsEntry() {

    @Composable
    override fun Composable(
        navController: NavHostController,
        destinations: Destinations,
        backStackEntry: NavBackStackEntry
    ) {

        Text(text = "Hello")

    }
}
