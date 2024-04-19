plugins {
    id("java-platform")
    `maven-publish`
}

group = "buildlogic.platform"

// allow the definition of dependencies to other platforms like the JUnit 5 BOM
javaPlatform.allowDependencies()

dependencies {
    api(platform("org.junit:junit-bom:${libs.versions.junitVersion.get()}"))

    constraints {
        api(libs.junit.jupiter.api)
        api(libs.junit.jupiter.engine)
        api(libs.junit.jupiter.params)
        api(libs.mockito.kotlin)
    }
}
