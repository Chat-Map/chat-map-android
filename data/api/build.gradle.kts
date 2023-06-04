plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.chatmap.api"
    compileSdk = 33

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
    implementation(project(":common"))

    implementation(Libs.AndroidX.core)
    implementation(Libs.AndroidX.lifecycle)

    implementation(platform(Libs.Compose.bom))
    implementation(Libs.Compose.activity)
    implementation(Libs.Compose.ui)
    implementation(Libs.Compose.toolingPreview)
    implementation(Libs.Compose.navigation)
    implementation(Libs.Compose.material)
    implementation(Libs.Compose.runtime)
}
