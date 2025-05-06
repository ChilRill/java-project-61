plugins {
    id("java")
    id("application")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass = "hexlet.code.App"
}
tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

sonar {
    properties {
        property("sonar.projectKey", "ChilRill_java-project-61")
        property("sonar.organization", "my-first-organization-hexlet")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}