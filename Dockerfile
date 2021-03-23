FROM maven:3.6.0-jdk-8 as Build
WORKDIR /app
COPY . .
RUN mvn -version
RUN mvn clean install




#args "-v /tmp/maven:/.mvn -e MAVEN_CONFIG=/.mvn"




