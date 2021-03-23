FROM maven:3.6.0-jdk-8 as Build
COPY . /app
#args "-v /tmp/maven:/.mvn -e MAVEN_CONFIG=/.mvn"




