# aws-eb-fluentd-kinesis-app
Sample spring boot application for AWS elasticbeanstalk with fluentd and kinesis configurations.

This application exposes two endpoints:

|Path|Description|
|---|---|
|/helloworld|Returns hello world message|
|/err|Throws ArithmeticException and returns error response|

To build the war artifact:

```
mvn clean package spring-boot:repackage
```
