package com.chatmap.app.ui

import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.chatmap.common.Destinations

@Composable
internal fun BottomMenuBar(
    navController: NavController,
    destinations: Destinations
) {
    val context = LocalContext.current
    NavigationBar() {

    }
}
