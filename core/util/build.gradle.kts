plugins {
    alias(libs.plugins.com.android.library)
    alias(libs.plugins.org.jetbrains.kotlin.android)
}

android {
    namespace = "com.runnect.runnect.util"
}

dependencies {
    implementation(project(":core:designsystem"))
    // for Analytics
    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.analytics)
    // for ContentUriRequestBody
    implementation(libs.retrofit.core)
    implementation(libs.okhttp)
    implementation(platform(libs.okhttp.bom))
    // for Permission
    implementation(libs.ted.permission)
    // for DiffUtil
    implementation(libs.androidx.recyclerview)
}