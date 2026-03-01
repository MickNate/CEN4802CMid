FROM openjdk:25-ea
COPY ./target/classes/com/mycompany/app /tmp
WORKDIR /tmp
EXPOSE 8082
ENTRYPOINT ["java","App"]