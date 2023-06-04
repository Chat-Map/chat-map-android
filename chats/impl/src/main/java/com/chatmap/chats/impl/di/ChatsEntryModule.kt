package com.chatmap.chats.impl.di

import com.chatmap.chats.api.ChatsEntry
import com.chatmap.chats.impl.ChatsEntryImpl
import com.chatmap.common.FeatureEntry
import com.chatmap.common.di.FeatureEntryKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
interface ChatsEntryModule {

    @Binds
    @Singleton
    @IntoMap
    @FeatureEntryKey(ChatsEntry::class)
    fun chatsEntry(entry: ChatsEntryImpl): FeatureEntry
}
