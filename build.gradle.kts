plugins {
    kotlin("jvm") version "2.0.21"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

application {
    mainClass.set("Day01Kt") // Ensure this matches the file name without the .kt extension
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "Day01Kt" // Ensure this matches the file name without the .kt extension
    }
}
sourceSets {
    main {
        kotlin.srcDir("src")
    }
}

tasks {
    wrapper {
        gradleVersion = "8.11"
    }
}
