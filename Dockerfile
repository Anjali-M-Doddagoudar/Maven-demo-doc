FROM openjdk:17
COPY target/demo-1.jar demo-1.jar
ENTRYPOINT ["java", "-jar", "demo-1.jar"]
