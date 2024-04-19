dependencyResolutionManagement {
    repositories {
        maven(url = uri("https://repo1.maven.org/maven2"))
        maven(url = uri("https://packages.confluent.io/maven"))
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

rootProject.name = "platforms"

include("microservices-platform")
include("test-platform")
include("plugins-platform")
