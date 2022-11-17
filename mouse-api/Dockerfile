FROM maven:3-eclipse-temurin-11-alpine

WORKDIR /mouse-api

ADD pom.xml .
RUN mvn verify --fail-never

ADD . .

RUN mvn -DskipTests clean package

WORKDIR /app
RUN cp ../mouse-api/target/mouse-api-0.0.1.jar .

CMD java -jar mouse-api-0.0.1.jar