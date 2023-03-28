plugins {
    id("increase.kotlin")
    id("increase.publish")
    id("java-library")
}

dependencies {
    api(project(":increase-java-client-okhttp"))
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}