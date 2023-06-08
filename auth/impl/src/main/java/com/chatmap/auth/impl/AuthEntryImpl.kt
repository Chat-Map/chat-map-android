package com.chatmap.auth.impl

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.chatmap.auth.api.AuthEntry
import com.chatmap.common.Destinations
import javax.inject.Inject

class AuthEntryImpl @Inject constructor() : AuthEntry() {

    override fun NavGraphBuilder.navigation(
        navController: NavHostController,
        destinations: Destinations
    ) {
        TODO("Not yet implemented")
    }
}
