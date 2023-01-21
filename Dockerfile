FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=build/libs/test-room-1.0.1.1.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]