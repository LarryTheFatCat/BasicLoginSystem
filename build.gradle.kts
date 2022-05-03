/**
 * counter = 2 ("increase if it fails")
 */


plugins {
    id("java")
}

tasks.withType<Jar> {
    // Otherwise, you'll get a "No main manifest attribute" error
    manifest {
        attributes["Main-Class"] = "main.LoginPageJava"
    }

    // To add all the dependencies otherwise a "NoClassDefFoundError" error
    from(sourceSets.main.get().output)

    dependsOn(configurations.runtimeClasspath)
    from({
        configurations.runtimeClasspath.get().filter { it.name.endsWith("jar") }.map { zipTree(it) }
    })
}