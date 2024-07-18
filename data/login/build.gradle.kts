plugins {
    alias(libs.plugins.com.android.library)
    alias(libs.plugins.org.jetbrains.kotlin.android)
    id("runnect.plugin.android.library")
}

android {
    namespace = "com.runnect.runnect.data.login"
}

dependencies {
    implementation(project(":domain"))
    implementation(libs.timber)
    implementation(libs.bundles.coroutine)
}