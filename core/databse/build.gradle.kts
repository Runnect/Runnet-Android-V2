plugins {
    alias(libs.plugins.com.android.library)
    alias(libs.plugins.org.jetbrains.kotlin.android)
    id("runnect.plugin.android.hilt")
}

android {
    namespace = "com.runnect.runnect.databse"

}

dependencies {
    implementation(libs.firebase.common)
    implementation(libs.firebase.firestore)
}