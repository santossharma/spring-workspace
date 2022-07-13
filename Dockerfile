FROM bellsoft/liberica-openjdk-alpine-musl:11
ADD target/spring-workspace-1.0.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
