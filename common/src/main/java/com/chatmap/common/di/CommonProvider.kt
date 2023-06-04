package com.chatmap.common.di

import android.content.Context
import androidx.compose.runtime.compositionLocalOf
import com.chatmap.common.di.CommonModule.IO
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Named

interface CommonProvider {

    @get:Named(IO)
    val ioDispatcher: CoroutineDispatcher

    val context: Context
}

val LocalCommonProvider = compositionLocalOf<CommonProvider> { error("No common provider found!") }
