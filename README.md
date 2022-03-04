# Argo Events Java Client

Argo Events

- API version: v1.6.3

No description provided (generated by Openapi Generator
https://github.com/openapitools/openapi-generator)

_Automatically generated by the
[OpenAPI Generator](https://openapi-generator.tech)_

## Requirements

Building the API client library requires:

1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply
execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the
repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html)
for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.argoproj.events</groupId>
  <artifactId>argo-events-client-java</artifactId>
  <version>v1.6.3</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.argoproj.events:argo-events-client-java:v1.6.3"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/argo-events-client-java-v1.6.3.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and examples below:

- [EventBus Example](src/main/java/io/argoproj/events/client/examples/EventBusExample.java)
- [EventSource Example](src/main/java/io/argoproj/events/client/examples/EventSourceExample.java)
- [Sensor Example](src/main/java/io/argoproj/events/client/examples/SensorExample.java)

These examples are runnable in a POD with proper RBAC settings, or on your
laptop if `${HOME}/.kube/config` is correctly configured (or `${KUBECONFIG}`
environment variable is pointing to the correct kubeconfig file).

## Documentation for Models

[Docs](docs)
