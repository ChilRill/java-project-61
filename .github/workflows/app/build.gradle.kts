plugins {
  id("org.sonarqube") version "6.0.1.5171"
}

sonar {
  properties {
    property("sonar.projectKey", "ChilRill_java-project-61")
    property("sonar.organization", "my-first-organization-hexlet")
    property("sonar.host.url", "https://sonarcloud.io")
  }
}
