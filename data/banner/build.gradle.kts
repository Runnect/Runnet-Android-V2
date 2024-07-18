plugins {
    alias(libs.plugins.com.android.library)
    alias(libs.plugins.org.jetbrains.kotlin.android)
    id("runnect.plugin.android.library")
    id("runnect.plugin.android.hilt")

}

android {
    namespace = "com.runnect.runnect.data.banner"
}

dependencies {
    implementation(project(":domain"))
    implementation(libs.timber)
    implementation(libs.bundles.coroutine)
}