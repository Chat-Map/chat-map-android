package com.chatmap.app.di

import com.chatmap.api.DataProvider
import com.chatmap.common.Destinations
import com.chatmap.common.di.CommonProvider
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [
        CommonProvider::class,
        DataProvider::class,
    ],
    modules = [NavigationModule::class]
)
interface AppComponent : AppProvider {
    override val destinations: Destinations
}