plugins {
    alias(libs.plugins.com.android.library)
    alias(libs.plugins.org.jetbrains.kotlin.android)
    id("runnect.plugin.android.library")
}

android {
    namespace = "com.runnect.runnect.domain"
}

dependencies {
    implementation(libs.bundles.coroutine)
}