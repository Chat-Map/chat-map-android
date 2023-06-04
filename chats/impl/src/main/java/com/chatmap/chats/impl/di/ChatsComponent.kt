package com.chatmap.chats.impl.di

import com.chatmap.api.DataProvider
import com.chatmap.chats.api.ChatsProvider
import com.chatmap.common.di.CommonProvider
import com.chatmap.common.di.FeatureScoped
import dagger.Component

@FeatureScoped
@Component(
    dependencies = [DataProvider::class, CommonProvider::class],
    modules = [ChatsModule::class]
)
interface ChatsComponent : ChatsProvider, DataProvider, CommonProvider {

    @Component.Factory
    interface Factory {
        fun create(commonProvider: CommonProvider, dataProvider: DataProvider): ChatsComponent
    }
}
