rootProject.name = "kotlinkino"

include("backend")
include("frontend")

pluginManagement {
    repositories {
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
        gradlePluginPortal()
        mavenCentral()
    }

    plugins {
        kotlin("jvm").version(extra["kotlin_version"] as String)
        id("org.jetbrains.compose").version(extra["compose_version"] as String)
        id("org.jetbrains.kotlin.plugin.compose").version(extra["kotlin_version"] as String)
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
    }
}