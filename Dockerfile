FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=test_pet_telegram_bot
ENV BOT_TOKEN=7718978829:AAHhjOVJh2KZCqwZ89b7_dog5-9GXojxaJQ
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-jar", "/app.jar"]