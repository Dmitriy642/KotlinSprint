plugins {
    kotlin("jvm") version "2.2.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(22)
}
tasks {
    withType<JavaExec> {
        jvmArgs = listOf("-Dfile.encoding=UTF-8")
    }

    withType<Test> {
        jvmArgs = listOf("-Dfile.encoding=UTF-8")
    }

    withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
}