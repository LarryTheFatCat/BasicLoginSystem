/**
 * counter = 2 ("increase if it fails")
 */


plugins {
    id("java")
}
/*
val library by configurations.creating
 */
group "main.LoginPage"
version "1.0-SNAPSHOT"
/*
dependencies {
    fun implementationAndLibrary(dependencyNotation: String) {
        implementation(dependencyNotation)
        library(dependencyNotation)
    }

    fun implementationAndLibrary(dependencyNotation: String, dependencyConfiguration: ExternalModuleDependency.() -> Unit) {
        implementation(dependencyNotation, dependencyConfiguration)
        library(dependencyNotation, dependencyConfiguration)
    }
    implementationAndLibrary("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.20")

}
 */
tasks.withType<Jar> {
    // Otherwise, you'll get a "No main manifest attribute" error
    manifest {
        attributes["Main-Class"] = "main.LoginPage"
    }

    // To add all of the dependencies otherwise a "NoClassDefFoundError" error
    from(sourceSets.main.get().output)

    dependsOn(configurations.runtimeClasspath)
    from({
        configurations.runtimeClasspath.get().filter { it.name.endsWith("jar") }.map { zipTree(it) }
    })
}
