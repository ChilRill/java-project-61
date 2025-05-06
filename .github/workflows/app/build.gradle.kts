plugins {
  id("org.sonarqube") version "6.0.1.5171"
  id("java")
  id("application")
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
sonar {
  properties {
    property("sonar.projectKey", "ChilRill_java-project-61")
    property("sonar.organization", "my-first-organization-hexlet")
    property("sonar.host.url", "https://sonarcloud.io")
  }
  checkstyle {
    toolVersion = "10.12.7"
    configFile = layout.projectDirectory.file("config/checkstyle/checkstyle.xml")
    reportsDir = layout.buildDirectory.dir("reports/checkstyle")
    reports {
      xml.required.set(true)
      html.required.set(true)
    }
  }
}
