FROM openjdk:25-ea
COPY src/main/java/com/mycompany/app/App.java /tmp
WORKDIR /tmp
EXPOSE 8082
ENTRYPOINT ["java","App"]