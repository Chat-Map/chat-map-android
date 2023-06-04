package com.chatmap.app

import android.app.Application
import com.chatmap.app.di.AppProvider
import com.chatmap.app.di.DaggerAppComponent
import com.chatmap.common.di.DaggerCommonComponent
import com.chatmap.impl.di.DaggerDataComponent

class ChatMapApp : Application() {

    lateinit var appProvider: AppProvider
        private set

    override fun onCreate() {
        super.onCreate()

        val commonProvider = DaggerCommonComponent.factory().create(this)
        appProvider = DaggerAppComponent.builder()
            .commonProvider(commonProvider)
            .dataProvider(DaggerDataComponent.builder().commonProvider(commonProvider).build())
            .build()
    }
}

val Application.appProvider: AppProvider
    get() = (this as ChatMapApp).appProvider
