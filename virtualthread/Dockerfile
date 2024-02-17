FROM ibm-semeru-runtimes:open-21.0.1_12-jre
ARG JAR_FILE=target/virtualthread-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
