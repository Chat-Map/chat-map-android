package com.chatmap.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.CompositionLocalProvider
import com.chatmap.api.LocalDataProvider
import com.chatmap.app.di.LocalAppProvider
import com.chatmap.common.di.LocalCommonProvider
import com.chatmap.common.ui.StatusBar
import com.chatmap.common.ui.theme.ApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ApplicationTheme {
                StatusBar(window = window, color = MaterialTheme.colorScheme.background)

                Surface(color = MaterialTheme.colorScheme.background) {
                    CompositionLocalProvider(
                        LocalAppProvider provides application.appProvider,
                        LocalDataProvider provides application.appProvider,
                        LocalCommonProvider provides application.appProvider
                    ) {
                        Navigation()
                    }
                }

//                NavigationBar(window = window, color = MaterialTheme.colorScheme.secondaryContainer)
            }
        }
    }
}
