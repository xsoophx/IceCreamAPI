plugins {
    kotlin("jvm") version "2.0.20"
    application
    id("io.ktor.plugin") version "3.0.0-beta-2"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

object Version {
    const val KTOR = "2.3.12"
    const val FUEL = "fuel:3.0.0-alpha1"
    const val JACKSON = "2.17.2"
    const val JUNIT = "5.11.0"
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("io.ktor:ktor-server-netty:${Version.KTOR}")
    implementation("io.ktor:ktor-server-content-negotiation:${Version.KTOR}")
    implementation("io.ktor:ktor-serialization-kotlinx-json:${Version.KTOR}")
    implementation("com.github.kittinunf.fuel:${Version.FUEL}")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:${Version.JACKSON}")
    testImplementation("org.junit.jupiter:junit-jupiter-api:${Version.JUNIT}")
    testImplementation("org.junit.jupiter:junit-jupiter-params:${Version.JUNIT}")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:${Version.JUNIT}")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

application {
    mainClass.set("MainKt")
}
