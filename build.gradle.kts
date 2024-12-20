plugins {
    kotlin("jvm") apply false
}

group = "io.github.sickandpanik"
version = "0.0.1"

class DeskriptionPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.task("deskription") {
            doLast {
                println("Deskrip is a deskriptor.")
            }
        }
    }
}

apply<DeskriptionPlugin>()