FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD congenial-spork-0.0.1-SNAPSHOT.jar congenial-spork.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/congenial-spork.jar"]