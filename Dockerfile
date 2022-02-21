FROM alpine:3.15

RUN apk add openjdk11

COPY target/cats-api-2.6.3.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"] 