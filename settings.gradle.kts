// Plugin Management should be the first block in this file.
pluginManagement {
    // Include 'plugins build' to define convention plugins.
    includeBuild("build-logic")
}

rootProject.name = "cs-journal"
include("java-playground")
include("kotlin-playground")
include("scala-playground")
include("springbootapp")

