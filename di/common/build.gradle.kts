plugins {
    alias(libs.plugins.com.android.library)
    alias(libs.plugins.org.jetbrains.kotlin.android)
    id("runnect.plugin.android.hilt")
}

android {
    namespace = "com.runnect.runnect.common"

}

dependencies {
    implementation(libs.okhttp.logging)
    implementation(platform(libs.okhttp.bom))
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.retrofit.core)
    implementation(libs.retrofit.kotlin.serialization)
}