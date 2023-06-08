import com.android.build.gradle.BaseExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

fun android(configuration: BaseExtension.() -> Unit) = configure(configuration)

android {
    compileSdkVersion(Libs.Project.compileSDK)

    defaultConfig {
        minSdk = Libs.Project.minSDK
        targetSdk = Libs.Project.targetSDK

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        named("release") {
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

    tasks.withType<KotlinCompile>().configureEach {
        kotlinOptions {
            jvmTarget = "18"
            freeCompilerArgs = listOf(
                "-Xopt-in=kotlin.RequiresOptIn", "-Xcontext-receivers"
            )
        }
    }

    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}
