package com.chatmap.app.ui

import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.chatmap.common.Destinations

@Composable
internal fun BottomBar(
    navController: NavController,
    destinations: Destinations
) {
    val context = LocalContext.current
    NavigationBar() {
        destinations.forEach {

        }


//        NavigationBarItem(selected =, onClick = { /*TODO*/ }) {
//
//        }

    }
}
