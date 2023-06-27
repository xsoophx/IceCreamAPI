plugins {
    kotlin("jvm") version "1.8.0"
    application
    id("io.ktor.plugin") version "2.3.1"

}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

object Version {
    const val KTOR = "2.3.1"
    const val FUEL = "fuel:3.0.0-alpha1"
    const val JACKSON = "2.15.0"
    const val JUNIT = "5.9.2"
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
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}