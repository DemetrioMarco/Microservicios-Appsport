FROM openjdk:17
VOLUME /tmp
ADD ./servicio-usuario-0.0.1-SNAPSHOT.jar servicio-usuarios.jar
ENTRYPOINT ["java","-jar","/servicio-usuarios.jar"]