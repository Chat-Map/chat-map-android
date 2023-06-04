plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
}

android {
    namespace = "com.chatmap.impl"
    compileSdk = 33

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
    api(project(":data:api"))
    implementation(project(":common"))

    implementation(Libs.AndroidX.core)
    implementation(Libs.AndroidX.lifecycle)

    implementation(Libs.Coroutines.android)
    implementation(Libs.Coroutines.core)

    implementation(Libs.Dagger.dagger)
    kapt(Libs.Dagger.daggerCompiler)
}
