package com.chatmap.app.di

import androidx.compose.runtime.compositionLocalOf
import com.chatmap.api.DataProvider
import com.chatmap.common.Destinations
import com.chatmap.common.di.CommonProvider

interface AppProvider : DataProvider, CommonProvider {

    val destinations: Destinations
}

val LocalAppProvider = compositionLocalOf<AppProvider> { error("No app provider found!") }
