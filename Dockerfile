FROM amazoncorretto:17-alpine-jdk AS build
WORKDIR /app
COPY build.gradle.kts gradlew ./
COPY gradle gradle
COPY src src
RUN ./gradlew build

FROM amazoncorretto:17-alpine-jdk
WORKDIR /app
COPY --from=build /app/build/libs/*.jar ./app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
