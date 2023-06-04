package com.chatmap.chats.api

import com.chatmap.common.ComposableFeatureEntry

abstract class ChatsEntry : ComposableFeatureEntry {

    final override val featureRoute: String
        get() = "chats"
}
