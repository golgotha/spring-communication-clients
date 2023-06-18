FROM openjdk:17.0.1-slim

MAINTAINER Valerii Kantor

RUN mkdir /app
COPY target/*.jar /app/app.jar

CMD exec java ${JAVA_OPTS} -Djava.security.egd="file:/dev/./urandom" -Djava.awt.headless=true -jar "/app/app.jar"
