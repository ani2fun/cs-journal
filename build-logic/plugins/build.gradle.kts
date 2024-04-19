plugins {
    `kotlin-dsl`
}

val catalog = extensions.getByType<VersionCatalogsExtension>().named("libs")

dependencies {
    // HERE YOU ARE ONLY DECLARING PLATFORM CONSTRAINT
    implementation(platform("buildlogic.platform:plugins-platform"))
    implementation(platform("buildlogic.platform:test-platform"))
    implementation(platform("buildlogic.platform:microservices-platform"))

    catalog.libraryAliases.map {
        implementation(catalog.findLibrary(it).get())
    }
}
