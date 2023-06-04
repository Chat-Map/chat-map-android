package com.chatmap.impl.di

import com.chatmap.api.DataProvider
import com.chatmap.common.di.CommonProvider
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(
    dependencies = [CommonProvider::class],
    modules = [DataModule::class]
)
interface DataComponent : DataProvider
