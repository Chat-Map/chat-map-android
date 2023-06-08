plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")

}

android {
    namespace = "com.chatmap.app"
    compileSdk = Libs.Project.compileSDK

    defaultConfig {
        applicationId = "com.chatmap.app"
        minSdk = Libs.Project.minSDK
        targetSdk = Libs.Project.targetSDK
        versionCode = Libs.Project.versionCode
        versionName = Libs.Project.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = false
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
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

    buildFeatures {
        compose = true
        buildConfig = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Libs.Compose.compiler
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(":chats:impl"))
    implementation(project(":auth:impl"))
    implementation(project(":data:impl"))
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

    implementation(Libs.Deps.googleMaterial)

    implementation(Libs.Coil.coil)
    implementation(Libs.Coil.coilCompose)

    implementation(Libs.Dagger.dagger)
    kapt(Libs.Dagger.daggerCompiler)

    debugImplementation(Libs.Compose.debug)
}
