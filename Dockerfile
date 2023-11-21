FROM openjdk:11-jdk-slim
ARG JAR_FILE=./out/artifacts/NBABack_jar/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
