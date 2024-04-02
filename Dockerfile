FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/blog-app-apis-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 5005
