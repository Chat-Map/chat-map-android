package com.chatmap.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.chatmap.api.LocalDataProvider
import com.chatmap.app.di.LocalAppProvider
import com.chatmap.app.ui.theme.ChatmapTheme
import com.chatmap.common.di.LocalCommonProvider

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ChatmapTheme {
                CompositionLocalProvider(
                    LocalAppProvider provides application.appProvider,
                    LocalDataProvider provides application.appProvider,
                    LocalCommonProvider provides application.appProvider
                ) {

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ChatmapTheme {
        Greeting("Android")
    }
}