plugins {
    id("increase.kotlin")
    id("increase.publish")
}

dependencies {
    api(project(":increase-java-core"))

    implementation("com.google.guava:guava:31.1-jre")
    implementation("com.squareup.okhttp3:okhttp:4.10.0")

    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.25.3")
    testImplementation("org.slf4j:slf4j-simple:1.7.36")
}
