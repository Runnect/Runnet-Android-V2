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

rootProject.name = "Runnect"
include(":app")
include(":core")
include(":build-logic")
include(":build-logic:convention")
include(":core:domain")
include(":core:data")
include(":core:base")
include(":navigator")
