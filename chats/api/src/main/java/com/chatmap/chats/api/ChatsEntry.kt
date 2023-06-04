package com.chatmap.chats.api

import com.chatmap.common.AggregateFeatureEntry

abstract class ChatsEntry : AggregateFeatureEntry {

    final override val featureRoute: String
        get() = "chats"
}
