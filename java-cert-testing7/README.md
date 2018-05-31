# Habitat package: java-cert-testing7

## Description

A simple plan to test Java CA Certs. (JRE7)

## Usage

```
hab pkg install --binlink core/jre7
hab pkg install predominant/java-cert-testing7

java -jar $(hab pkg path predominant/java-cert-testing7)/CertTester.jar
```
