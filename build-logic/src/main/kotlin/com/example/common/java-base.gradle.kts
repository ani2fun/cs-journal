package com.example.common

import com.example._constants.CHARACTER_ENCODING
import com.example._constants.JDK_VERSION

plugins {
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

java {
    // Auto JDK setup
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(JDK_VERSION))
    }
}

tasks.named<Jar>("jar") {
    enabled = false
}

tasks.withType<JavaCompile> {
    options.encoding = CHARACTER_ENCODING
    // See: https://docs.oracle.com/en/java/javase/12/tools/javac.html
    options.compilerArgs.addAll(
        listOf(
             "-Xlint:all", // Enables all recommended warnings.
             // "-Werror", // Terminates compilation when warnings occur.
        ),
    )
}
