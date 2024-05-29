FROM yannoff/maven:3-openjdk-17 AS builder

WORKDIR /app
COPY pom.xml /app/
COPY src /app/src/
RUN mvn dependency:resolve
COPY . /app
RUN mvn -Dmaven.test.skip=true -DskipTests package -f ./pom.xml clean package
FROM openjdk:17-slim AS runner

COPY --from=builder /app/target/demo-0.0.1-SNAPSHOT.jar .
CMD java -jar demo-0.0.1-SNAPSHOT.jar