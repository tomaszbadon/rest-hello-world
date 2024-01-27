FROM openjdk:17
ADD ../build/libs/rest-demo-0.0.1-SNAPSHOT.jar ~/rest-demo-0.0.1-SNAPSHOT.jar
EXPOSE 8080/tcp
WORKDIR ~/
ENTRYPOINT [ "java", "-jar", "rest-demo-0.0.1-SNAPSHOT.jar"]

# docker build --tag rest-hello-world-app:latest .
# docker run -p 8080:8080 rest-hello-world-app:latest
# tomaszbadon@macbook-air-tomasz-2 rest-hello-world % d
# docker push tomaszbadon/rest-hello-world-app:latest

