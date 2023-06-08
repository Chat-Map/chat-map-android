package com.chatmap.auth.impl.signIn.di

import com.chatmap.auth.impl.di.AuthComponent
import com.chatmap.common.di.SubfeatureScoped
import dagger.Component

@SubfeatureScoped
@Component(
    dependencies = [AuthComponent::class],
    modules = [SignInModule::class]
)
interface SignInComponent {
    
}
