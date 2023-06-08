plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")

    `android-config`
}

android {
    namespace = "com.chatmap.chats.impl"

    buildFeatures.compose = true
    composeOptions {
        kotlinCompilerExtensionVersion = Libs.Compose.compiler

    }
}

dependencies {
    api(project(":chats:api"))
    implementation(project(":data:api"))
    implementation(project(":common"))

    implementation(Libs.AndroidX.core)
    implementation(Libs.AndroidX.lifecycle)

    implementation(platform(Libs.Compose.bom))
    implementation(Libs.Compose.activity)
    implementation(Libs.Compose.ui)
    implementation(Libs.Compose.graphics)
    implementation(Libs.Compose.toolingPreview)
    implementation(Libs.Compose.material)
    implementation(Libs.Compose.runtime)

    implementation(Libs.Compose.navigation)
    implementation(Libs.Compose.viewModel)
    implementation(Libs.Compose.lifecycle)

    implementation(Libs.Coroutines.core)
    implementation(Libs.Coroutines.android)

    implementation(Libs.Coil.coil)
    implementation(Libs.Coil.coilCompose)

    implementation(Libs.Dagger.dagger)
    kapt(Libs.Dagger.daggerCompiler)
}
