plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
}

android {
    namespace = "com.chatmap.common"

    compileSdk = Libs.Project.compileSDK
    
    buildFeatures.compose = true

    composeOptions {
        kotlinCompilerExtensionVersion = Libs.Compose.compiler
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_18
        targetCompatibility = JavaVersion.VERSION_18
    }

    kotlinOptions {
        freeCompilerArgs = listOf("-Xcontext-receivers")
    }

    kotlin {
        jvmToolchain(18)
    }
}

dependencies {

    // ===== android =====
    implementation(Libs.AndroidX.core)
    implementation(Libs.AndroidX.lifecycle)

    // ===== compose =====
    implementation(platform(Libs.Compose.bom))
    implementation(Libs.Compose.ui)
    implementation(Libs.Compose.material)
    implementation(Libs.Compose.activity)
    implementation(Libs.Compose.viewModel)
    implementation(Libs.Compose.navigation)
    implementation(Libs.Compose.runtime)
    debugImplementation(Libs.Compose.debug)

    // ===== kotlin =====
    implementation(Libs.Coroutines.core)
    implementation(Libs.Coroutines.android)

    // ===== dagger =====
    implementation(Libs.Dagger.dagger)
    kapt(Libs.Dagger.daggerCompiler)

}
