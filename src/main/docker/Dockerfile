FROM openjdk:8
VOLUME /tmp
ADD congenial-spork-0.0.1-SNAPSHOT.jar congenial-spork.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java","$JAVA_OPTS,-Djava.security.egd=file:/dev/./urandom","-jar","/congenial-spork.jar"]