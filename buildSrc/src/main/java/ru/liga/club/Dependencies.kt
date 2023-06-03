package ru.liga.club

object Libs {
    object Project {
        const val minSDK = 26
        const val compileSDK = 33
        const val targetSDK = 33
        const val versionCode = 28
        const val versionName = "0.1"
    }

    object Kotlin {
        const val version = "1.8.10"
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }

    object Plugins {
        const val gradleVersion = "8.0.1"
        const val gradle = "com.android.tools.build:gradle:${gradleVersion}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
        const val google = "com.google.gms:google-services:4.3.13"
        const val firebase = "com.google.firebase:firebase-crashlytics-gradle:2.9.1"
        const val safeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:2.5.1"
    }

    object Coroutines {
        const val version = "1.6.1"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
    }

    object Firebase {
        const val platform = "com.google.firebase:firebase-bom:29.3.1"
        const val authenticationKtx = "com.google.firebase:firebase-auth-ktx"
        const val databaseKtx = "com.google.firebase:firebase-database-ktx"
        const val crashlyticsKtx = "com.google.firebase:firebase-crashlytics-ktx"
        const val analyticsKtx = "com.google.firebase:firebase-analytics-ktx"
        const val messagingKtx = "com.google.firebase:firebase-messaging-ktx"
        const val configKtx = "com.google.firebase:firebase-config-ktx"
    }

    object Compose {
        const val version = "1.4.0"
        const val bom = "androidx.compose:compose-bom:2023.05.01"
        const val toolingPreview = "androidx.compose.ui:ui-tooling-preview"
        const val ui = "androidx.compose.ui:ui"
        const val util = "androidx.compose.ui:ui-util"
        const val materialIcons = "androidx.compose.material:material-icons-core"
        const val tooling = "androidx.compose.ui:ui-tooling"
        const val runtime = "androidx.compose.runtime:runtime"
        const val activity = "androidx.activity:activity-compose:1.7.2"
        const val animations = "androidx.compose.animation:animation"
        const val material = "androidx.compose.material3:material3"
        const val graphics = "androidx.compose.ui:ui-graphics"
        const val manifest = "androidx.compose.ui:ui-test-manifest"

        const val navigation = "androidx.navigation:navigation-compose:2.5.3"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1"
        const val lifecycle = "androidx.lifecycle:lifecycle-runtime-compose:2.6.1"
        const val glide = "com.github.skydoves:landscapist-glide:1.5.0"
        const val customViewPollingContainer =
            "androidx.customview:customview-poolingcontainer:1.0.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout-compose:1.0.1"
        const val paging3 = "androidx.paging:paging-compose:1.0.0-alpha14"
        const val shimmer = "com.valentinilk.shimmer:compose-shimmer:1.0.4"
    }

    object GoogleAccompanist {
        const val version = "0.25.1"
        const val systemUiController =
            "com.google.accompanist:accompanist-systemuicontroller:$version"
        const val pager = "com.google.accompanist:accompanist-pager:$version"
        const val pagerIndicator = "com.google.accompanist:accompanist-pager-indicators:$version"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
        const val converterGson = "com.squareup.retrofit2:converter-gson:2.9.0"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:4.9.3"
        const val okhttpStetho = "com.facebook.stetho:stetho-okhttp3:1.5.1"
    }

    object YandexMetrics {
        const val metricaLib = "com.yandex.android:mobmetricalib:4.2.0"
        const val metricaPushLib = "com.yandex.android:mobmetricapushlib:2.1.1"
    }

    object Gson {
        const val gson = "com.google.code.gson:gson:2.8.9"
    }

    object Coil {
        const val version = "2.2.2"
        const val coil = "io.coil-kt:coil:$version"
        const val coilCompose = "io.coil-kt:coil-compose:$version"
    }

    object Deps {
        const val lottie = "com.airbnb.android:lottie:3.4.0"
        const val imageCropper = "com.vanniktech:android-image-cropper:4.3.3"
        const val appIntro = "com.github.AppIntro:AppIntro:6.0.0"
        const val circleImage = "de.hdodenhof:circleimageview:2.1.0"
        const val skeletonLayout = "com.faltenreich:skeletonlayout:3.0.0"
        const val maskedET = "io.github.vicmikhailau:MaskedEditText:4.0.7"

    }

    object AndroidX {
        const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:2.5.3"
        const val navigationUI = "androidx.navigation:navigation-ui-ktx:2.5.3"
        const val fragment = "androidx.fragment:fragment-ktx:1.5.3"
        const val swipeRefresh = "androidx.swiperefreshlayout:swiperefreshlayout:1.1.0"
        const val core = "androidx.core:core-ktx:1.10.1"
        const val appCompat = "androidx.appcompat:appcompat:1.5.0"
        const val paging = "androidx.paging:paging-runtime-ktx:3.1.1"
        const val dataStorePreferences = "androidx.datastore:datastore-preferences:1.0.0"
        const val dataStoreCore = "androidx.datastore:datastore-preferences-core:1.0.0"
        const val activity = "androidx.activity:activity-ktx:1.7.1"
        const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:2.6.1"
    }

    object Dagger {
        const val dagger = "com.google.dagger:dagger:2.45"
        const val daggerCompiler = "com.google.dagger:dagger-compiler:2.45"
    }
}
