package com.example.standalone

plugins {
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}

dependencies {
    implementation("org.apache.commons:commons-text:1.10.0")
    implementation("com.opencsv:opencsv:5.7.1")
    implementation("org.jsoup:jsoup:1.15.4")
    implementation("org.realityforge.org.jetbrains.annotations:org.jetbrains.annotations:1.7.0")
}
