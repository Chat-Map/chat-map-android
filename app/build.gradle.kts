import ru.liga.club.Libs

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Libs.AndroidX.core)
    implementation(Libs.AndroidX.lifecycle)

    implementation(platform(Libs.Compose.bom))
    implementation(Libs.Compose.activity)
    implementation(Libs.Compose.ui)
    implementation(Libs.Compose.graphics)
    implementation(Libs.Compose.toolingPreview)
    implementation(Libs.Compose.material)

    implementation(Libs.Compose.navigation)
    implementation(Libs.Compose.viewModel)
    implementation(Libs.Compose.lifecycle)

    implementation(Libs.Coroutines.core)
    implementation(Libs.Coroutines.android)

    debugImplementation(Libs.Compose.tooling)
    debugImplementation(Libs.Compose.manifest)


}