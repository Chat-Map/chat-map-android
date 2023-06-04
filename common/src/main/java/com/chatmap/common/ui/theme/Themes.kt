package com.chatmap.common.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

internal val LightColorPalette
    @Composable get() = lightColorScheme()

internal val DarkColorPalette
    @Composable get() = darkColorScheme()

val defaultTextColor: Color
    @Composable get() = Color.Gray

@Composable
fun ApplicationTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    isDynamicColor: Boolean = false,
    content: @Composable () -> Unit,
) {
    val dynamicColor = isDynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S

    val myColorScheme = when {
        dynamicColor && isDarkTheme -> {
            dynamicDarkColorScheme(LocalContext.current)
        }

        dynamicColor && !isDarkTheme -> {
            dynamicLightColorScheme(LocalContext.current)
        }

        isDarkTheme -> DarkColorPalette
        else -> LightColorPalette
    }

    MaterialTheme(colorScheme = myColorScheme, typography = ChatmapTypography, content = content)
}


@Preview(showSystemUi = false, showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
private fun ChatmapFonts_Preview() {
    ApplicationTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            val examples = listOf(
                FontStub(
                    "displayLarge - Montserrat 57, light",
                    MaterialTheme.typography.displayLarge
                ),
                FontStub(
                    "displayMedium default - Montserrat 45, light",
                    MaterialTheme.typography.displayMedium
                ),
                FontStub(
                    "displaySmall - Montserrat 36, regular",
                    MaterialTheme.typography.displaySmall
                ),
                FontStub(
                    "headlineLarge - Montserrat 32, semibold",
                    MaterialTheme.typography.headlineLarge
                ),
                FontStub(
                    "headlineMedium - Montserrat, 28, semibold",
                    MaterialTheme.typography.headlineMedium
                ),
                FontStub(
                    "headlineSmall - Montserrat, 24, semibold",
                    MaterialTheme.typography.headlineSmall
                ),
                FontStub(
                    "titleLarge - Montserrat, 22, semibold",
                    MaterialTheme.typography.titleLarge
                ),
                FontStub(
                    "titleMedium - Montserrat, 16, semibold",
                    MaterialTheme.typography.titleMedium
                ),
                FontStub(
                    "titleSmall - Montserrat, 14, bold",
                    MaterialTheme.typography.titleSmall
                ),
                FontStub(
                    "bodyLarge - Montserrat, 16, regular",
                    MaterialTheme.typography.bodyLarge
                ),
                FontStub(
                    "bodyMedium - Montserrat, 14, medium",
                    MaterialTheme.typography.bodyMedium
                ),
                FontStub(
                    "bodySmall - Montserrat, 12, bold",
                    MaterialTheme.typography.bodySmall
                ),
            )

            LazyColumn {
                items(examples) {
                    Text(
                        modifier = Modifier.padding(8.dp),
                        text = it.text,
                        style = it.style
                    )
                }
            }
        }
    }
}

private class FontStub(
    val text: String,
    val style: TextStyle,
)
