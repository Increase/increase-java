import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

publishing {
  repositories {
      if (project.hasProperty("publishLocal")) {
          maven {
              name = "LocalFileSystem"
              url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
          }
      }
  }
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    if (!project.hasProperty("publishLocal")) {
        signAllPublications()
        publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    }

    coordinates(project.group.toString(), project.name, project.version.toString())
    configure(
        KotlinJvm(
            javadocJar = JavadocJar.Dokka("dokkaJavadoc"),
            sourcesJar = true,
        )
    )

    pom {
        name.set("Increase API")
        description.set("Anything that you can achieve with PDFs, presence, and persistence in a bank\nbranch you can do with our API. Our API faithfully exposes the data and\ncapabilities of the Federal Reserve, Visa, The Clearing House, depository\nnetworks, and accounting tools. It's lovingly boring and exceptionally powerful.\nIf you have any questions or want to get started, don't hesitate to ping us at\nsales@increase.com. We can't wait to see what you build!")
        url.set("https://increase.com/documentation")

        licenses {
            license {
                name.set("Apache-2.0")
            }
        }

        developers {
            developer {
                name.set("Increase")
                email.set("dev-feedback@increase.com")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/Increase/increase-java.git")
            developerConnection.set("scm:git:git://github.com/Increase/increase-java.git")
            url.set("https://github.com/Increase/increase-java")
        }
    }
}

tasks.withType<Zip>().configureEach {
    isZip64 = true
}
