package com.chatmap.chats.impl

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.chatmap.chats.api.ChatsEntry
import com.chatmap.common.Destinations
import javax.inject.Inject

class ChatsEntryImpl @Inject constructor() : ChatsEntry() {

    override fun NavGraphBuilder.navigation(
        navController: NavHostController,
        destinations: Destinations
    ) {

    }
}
