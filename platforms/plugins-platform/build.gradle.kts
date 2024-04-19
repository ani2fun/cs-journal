plugins {
    id("java-platform")
    `maven-publish`
}

group = "buildlogic.platform"

// allow the definition of dependencies to other platforms like the Spring Boot BOM
javaPlatform.allowDependencies()

dependencies {
    constraints {
        api(libs.kotlin.jvm.gradle.plugin)
        api(libs.spring.boot.gradle.plugin)
        api(libs.openapi.generator.gradle.plugin)
        api(libs.ktlint.plugin)
        api(libs.avro.generator.gradle.plugin)
    }
}
