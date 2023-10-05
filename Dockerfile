FROM amazoncorretto:17-alpine
VOLUME /tmp
ARG JAR_FILE=build/libs/Hello_Name-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]