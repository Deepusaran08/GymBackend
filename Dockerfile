FROM openjdk:17

COPY target/spring-boot-docker-gymBackend /usr/app/

WORKDIR /usr/app

ENTRYPOINT [ "java","-jar", "spring-boot-docker-gymBackend" ]