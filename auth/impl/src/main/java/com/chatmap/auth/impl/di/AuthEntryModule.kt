package com.chatmap.auth.impl.di

import com.chatmap.auth.api.AuthEntry
import com.chatmap.auth.impl.AuthEntryImpl
import com.chatmap.common.FeatureEntry
import com.chatmap.common.di.FeatureEntryKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
interface AuthEntryModule {

    @Binds
    @Singleton
    @IntoMap
    @FeatureEntryKey(AuthEntry::class)
    fun authEntry(entry: AuthEntryImpl): FeatureEntry
}
