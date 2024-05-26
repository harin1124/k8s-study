## Task에서 빌드 후 실행 필요
# APP
FROM openjdk:17.0-slim
WORKDIR /app

# 빌더 이미지에서 jar 파일만 복사
ARG JAR_FILE=build/libs/sample-spring-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} .

EXPOSE 8088

# root 대신 nobody 권한으로 실행
USER root
ENTRYPOINT [                                     \
    "java",                                      \
    #"-Dspring.profiles.active=local",              \
    "-jar",                                      \
    "sample-spring-0.0.1-SNAPSHOT.jar"           \
]

