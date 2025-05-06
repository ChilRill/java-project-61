plugins {
    id("java")
    id("application")
    id("org.sonarqube") version "6.0.1.5171"
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
}
checkstyle {
    toolVersion = "10.12.7" // <-- Укажите версию утилиты Checkstyle

    // >>> ИСПРАВЛЕНО: Правильный синтаксис для указания файла правил <<<
    // Используем .set() для присвоения значения свойству configFile
    configFile.set(layout.projectDirectory.file("config/checkstyle/checkstyle.xml"))

    // >>> ИСПРАВЛЕНО: Правильный синтаксис для указания директории отчетов <<<
    // Используем .set() для присвоения значения свойству reportsDir
    reportsDir.set(layout.buildDirectory.dir("reports/checkstyle"))

    // >>> ИСПРАВЛЕНО: Правильный синтаксис для блока отчетов <<<
    reports {
        xml { // Доступ к конфигурации XML отчета
            required.set(true) // Включаем генерацию XML отчета
        }
        html { // Доступ к конфигурации HTML отчета
            required.set(true) // Включаем генерацию HTML отчета
        }
    }
}
