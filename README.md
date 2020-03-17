# aws-eb-spring-boot-fluentd-kinesis-example-app
Sample spring boot application for AWS elasticbeanstalk with fluentd and kinesis configurations.

This application exposes two endpoints:

|Path|Description|
|---|---|
|/helloworld|Returns hello world message|
|/err|Throws ArithmeticException and returns error response|

To build the jar artifact:

```
mvn package spring-boot:repackage
```

To run it in your local:

```
java -jar aws-eb-spring-boot-fluentd-kinesis-example-app-1.0-SNAPSHOT.jar
```