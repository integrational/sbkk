FROM openjdk:8-jdk-alpine
ARG JAR_FILE
ADD target/${JAR_FILE} sbkk.jar
ENV JAVA_OPTS="-Xmx1024m -Xms1024m"
ENTRYPOINT exec java $JAVA_OPTS -jar /sbkk.jar