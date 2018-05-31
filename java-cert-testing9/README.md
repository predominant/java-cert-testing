# Habitat package: java-cert-testing9

## Description

A simple plan to test Java CA Certs. (JRE9)

## Usage

```
hab pkg install --binlink core/jre9
hab pkg install predominant/java-cert-testing9

java -jar $(hab pkg path predominant/java-cert-testing9)/CertTester.jar
```
