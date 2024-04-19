plugins {
    id("java-platform")
    `maven-publish`
}

group = "buildlogic.platform"

// allow the definition of dependencies to other platforms like the Spring Boot BOM
javaPlatform.allowDependencies()

val libraries = extensions.getByType<VersionCatalogsExtension>().named("libs")

dependencies {
    api(platform("org.springframework.boot:spring-boot-dependencies:${libs.versions.springBootVersion.get()}"))
    api(platform("org.springframework.cloud:spring-cloud-dependencies:${libs.versions.springCloudVersion.get()}"))
    api(platform("org.junit:junit-bom:${libs.versions.junitVersion.get()}"))

    constraints {
        libraries.libraryAliases.map {
            api(libraries.findLibrary(it).get())
        }
    }
}
