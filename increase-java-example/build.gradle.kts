plugins {
    id("java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":increase-java"))
}

java {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    sourceCompatibility = JavaVersion.VERSION_1_9
    targetCompatibility = JavaVersion.VERSION_1_9
}

application {
    mainClass = "com.increase.api.example.Main"
}
