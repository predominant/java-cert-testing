# Habitat package: java-cert-testing8

## Description

A simple plan to test Java CA Certs. (JRE8)

## Usage

```
hab pkg install --binlink core/jre8
hab pkg install predominant/java-cert-testing8

java -jar $(hab pkg path predominant/java-cert-testing8)/CertTester.jar
```
