FROM ibm-semeru-runtimes:open-21.0.1_12-jre
ARG JAR_FILE=target/reactive-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
CMD ["java", \
"-Dcom.sun.management.jmxremote=true", \
"-Dcom.sun.management.jmxremote.port=8086", \
"-Dcom.sun.management.jmxremote.rmi.port=8086", \
"-Dcom.sun.management.jmxremote.local.only=false", \
"-Dcom.sun.management.jmxremote.authenticate=false", \
"-Dcom.sun.management.jmxremote.ssl=false", \
"-Djava.rmi.server.hostname=localhost", \ 
"-jar","/app.jar" \
]