package com.chatmap.auth.api

import com.chatmap.common.AggregateFeatureEntry

abstract class AuthEntry : AggregateFeatureEntry {

    final override val featureRoute: String
        get() = "auth"
}
