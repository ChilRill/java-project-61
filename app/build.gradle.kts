plugins {
    id("java")
    id("application")
    id("org.sonarqube") version "4.4.1.3373"
    id("checkstyle")
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

checkstyle {
    toolVersion = "10.12.1"
    configFile = layout.projectDirectory.file("config/checkstyle/checkstyle.xml").asFile

}
sonar {
    properties {
        property("sonar.projectKey", "ChilRill_java-project-61")
        property("sonar.organization", "my-first-organization-hexlet")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}