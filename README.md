# Mist Tools for Java

## Usage (Gradle)

1. In your `build.gradle` file, add this repository:

   ```groovy
   repositories {
       ...
       maven {
           url = uri("https://maven.pkg.github.com/mist-cloud-eu/mist-tools-java")
       }
   }
   ```

1. Under dependencies, specify the artifact and version:

   ```groovy
   dependencies {
       ...
       implementation 'eu.mist-cloud.tools.java:mist-tools-java:<version>'
   }
   ```

## Development

This library is built with the LTS version of the OpenJDK,
which is currently 17.0.2.

## Build

```shell
./gradlew build
```

## Testing Locally

To push a package to your local Maven repository, use the following command:

```shell
./gradlew clean build publishToMavenLocal
```

In another project,

1. add the repository,

   ```groovy
   repositories {
       mavenLocal()
       ...
   }
   ```

1. add the dependency:

   ```groovy
   dependencies {
       ...
       implementation 'eu.mist-cloud.tools.java:mist-tools-java:0.1.0-SNAPSHOT'
   }
   ```

Where the version matches the one in this projects' `build.gradle`.

## Making a new Release

1. Push a new `git tag` with the proper version of the project.
1. Navigate to `releases` on the GitHub project, and draft a new release.
   - name it using the git tag

After creating the release a github action will trigger,
which bundles the `jar` and adds it to the release.
