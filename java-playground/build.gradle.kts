plugins {
    id("buildlogic.commons-base")
}

repositories {
    mavenCentral()
}


val jarsInResources = fileTree(projectDir.resolve("src/main/resources")).include("*.jar")
dependencies {
    // Manually added External Lib
    implementation(jarsInResources)

    implementation("com.opencsv:opencsv:5.7.1")
    implementation("org.jsoup:jsoup:1.15.4")
}
// Name of the ZIP file to Submit
val nameOfZip = "hello"
// Source Directory - change dir paths: "src/main/java/io/journal/algocs/submissions/$DIR_NAME"
val sourceDirAsFile = layout.projectDirectory.dir("src/main/java/io/journal/algocs/submissions/_1").asFile
// Destination Directory: build/tmp/$nameOfZip
var destDirAsFile = layout.buildDirectory.dir("tmp").getOrElse(layout.buildDirectory.get()).asFile.resolve(nameOfZip)

// This custom task will remove "package * lines and create a zip file to submit"
tasks.register<RemovePackageLine>("removePackageLine", sourceDirAsFile, destDirAsFile)

tasks.register<Zip>("zip") {
    dependsOn(tasks.withType<JavaCompile>())
        .dependsOn(tasks.named<RemovePackageLine>("removePackageLine"))
    archiveFileName.set("$nameOfZip.zip")
    from(layout.buildDirectory.dir("tmp").get().asFile.resolve(nameOfZip))
    destinationDirectory.set(layout.buildDirectory)
}