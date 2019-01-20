FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG DEPENDENCY=target/dependency
ENV BOOTSTRAP_SERVERS="localhost:9092"

COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","com.aelastic.xspot.users.UsersApplication","-Dspring.kafka.bootstrap-servers=$BOOTSTRAP_SERVERS"]