pluginManagement {
    includeBuild("build-logic")
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

rootProject.name = "Runnect"
include(":app")
include(":core")
include(":navigator")
include(":core:base")
include(":core:designsystem")
include(":core:databse")
include(":core:util")
include(":di")
include(":di:course")
include(":di:common")
include(":di:user")
include(":di:search")
include(":di:storage")
include(":di:login")
include(":di:reverseGeocoding")
include(":di:banner")
include(":domain")
include(":data")
include(":data:banner")
include(":data:course")
include(":data:search")
include(":data:login")
include(":data:reversegeocoding")
include(":data:storage")
include(":data:storage")
include(":data:user")
include(":data:common")
