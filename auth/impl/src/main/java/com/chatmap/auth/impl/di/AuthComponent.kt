package com.chatmap.auth.impl.di

import com.chatmap.api.DataProvider
import com.chatmap.auth.api.AuthProvider
import com.chatmap.common.di.CommonProvider
import com.chatmap.common.di.FeatureScoped
import dagger.Component

@FeatureScoped
@Component(
    dependencies = [DataProvider::class, CommonProvider::class],
    modules = [AuthModule::class]
)
interface AuthComponent : AuthProvider, DataProvider, CommonProvider {

    @Component.Factory
    interface Factory {
        fun create(commonProvider: CommonProvider, dataProvider: DataProvider): AuthComponent
    }
}
