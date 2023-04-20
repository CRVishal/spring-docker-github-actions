# build stage
FROM maven:3.6.3-jdk-11-slim AS builder
WORKDIR /docker/app
COPY src /docker/app/src
COPY pom.xml /docker/app
RUN mvn -f /docker/app/pom.xml install -DskipTests

# package stage
FROM adoptopenjdk/openjdk11:latest
WORKDIR /opt/app
# EXPOSE 8080
COPY --from=builder /docker/app/target/*.jar /opt/app/hello_world_for_docker.jar
ENTRYPOINT ["java", "-jar", "/opt/app/hello_world_for_docker.jar" ]
