FROM eclipse-temurin:17-jdk-alpine
LABEL authors="Saad Rahman Warsi"
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 9051