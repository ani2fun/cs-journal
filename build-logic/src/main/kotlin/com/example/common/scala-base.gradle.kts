package com.example.common

plugins {
    // Apply the java-library plugin for API and implementation separation.
    id("com.example.common.java-base")
    // Apply the Scala JVM plugin to add support for Scala on the JVM.
    scala
}

val versionCatalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

dependencies {
    add("implementation", versionCatalog.findLibrary("scala-library").get())

    add("testImplementation", versionCatalog.findLibrary("junit").get())
    add("testImplementation", versionCatalog.findLibrary("scala-test").get())
    add("testImplementation", versionCatalog.findLibrary("scala-test-plus").get())

    add("testRuntimeOnly", versionCatalog.findLibrary("scala-xml").get())
}

