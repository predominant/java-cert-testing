pkg_name=java-cert-testing8
pkg_origin=predominant
pkg_version="0.1.0"
pkg_maintainer="Graham Weldon <graham@grahamweldon.com>"
pkg_license=("Apache-2.0")
pkg_deps=(core/jre8)
pkg_build_deps=(core/jdk8)

do_build() {
  javac ../CertTester.java
  jar cfe CertTester.jar CertTester ../CertTester.class
  rm ../CertTester.class
}

do_install() {
  mv CertTester.jar "${pkg_prefix}"/
}
