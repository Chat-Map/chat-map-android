package com.chatmap.app.di

import com.chatmap.chats.impl.di.ChatsEntryModule
import dagger.Module

@Module(includes = [ChatsEntryModule::class])
interface NavigationModule
