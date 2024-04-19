import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import java.io.File
import javax.inject.Inject

abstract class RemovePackageLine
    @Inject
    constructor(
        private val sourceDir: File,
        private val destDir: File,
    ) : DefaultTask() {
        @TaskAction
        fun zipForSubmission() {
            val packagePrefix = "package"

            if (!sourceDir.exists()) {
                println("Source directory does not exist")
                return
            }

            if (!destDir.exists()) {
                destDir.mkdirs()
            }

            sourceDir.listFiles { file -> file.isFile && file.extension == "java" }?.forEach { file ->
                val lines = file.readLines()
                val modifiedLines = lines.filterNot { it.trim().startsWith(packagePrefix) || it.isBlank() }
                val destFilePath = "${destDir.absolutePath}/${file.name}"
                File(destFilePath).writeText(modifiedLines.joinToString("\n"))
            }
        }
    }
