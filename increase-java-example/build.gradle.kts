plugins {
    id("increase.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":increase-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :increase-java-example:run` to run `Main`
    // Use `./gradlew :increase-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.increase.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
