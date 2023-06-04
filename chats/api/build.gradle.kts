plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")

    `android-config`
}

android {
    namespace = "com.chatmap.chats.api"

    buildFeatures.compose = true
    composeOptions {
        kotlinCompilerExtensionVersion = Libs.Compose.compiler

    }
}

dependencies {
    implementation(project(":common"))

    implementation(Libs.AndroidX.core)
    implementation(Libs.AndroidX.lifecycle)

    implementation(platform(Libs.Compose.bom))
    implementation(Libs.Compose.activity)
    implementation(Libs.Compose.ui)
    implementation(Libs.Compose.toolingPreview)
    implementation(Libs.Compose.material)
    implementation(Libs.Compose.runtime)
    implementation(Libs.Compose.navigation)

}
