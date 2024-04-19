pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
        maven(url = uri("https://repo1.maven.org/maven2"))
        maven(url = uri("https://packages.confluent.io/maven"))
    }
    versionCatalogs {
        val libs by creating {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

includeBuild("../platforms")

include("plugins")

rootProject.name = "build-logic"
