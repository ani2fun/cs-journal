import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    id("java")
}

// IMPORTANT: DEFINE GRADLE BUILD GROUP FOR PROJECT BUILDING AND SHARING DEPENDENCIES AMONG PROJECTS
group = GRADLE_GROUP
version = PROJECT_VERSION

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(JAVA_VERSION)
    }
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = CHARACTER_ENCODING
    options.compilerArgs.addAll(
        listOf(
            // "-Xlint:all",
            // "-Werror",
        ),
    )
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
    testLogging {
        events = setOf(TestLogEvent.FAILED)
        exceptionFormat = TestExceptionFormat.FULL
        events("passed", "skipped", "failed")
    }
}

dependencies {
    // PLATFORM project ":platforms"
    implementation(platform("buildlogic.platform:microservices-platform"))
    implementation(platform("buildlogic.platform:plugins-platform"))
    testImplementation(platform("buildlogic.platform:test-platform"))

    // OTHER
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}
