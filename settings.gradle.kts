@file:Suppress("UnstableApiUsage")
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "chatmap"
include(":app")
include(":common")
include(":data", ":data:api", ":data:impl")
include(":chats", ":chats:api", ":chats:impl")
include(":auth", ":auth:api", ":auth:impl")
