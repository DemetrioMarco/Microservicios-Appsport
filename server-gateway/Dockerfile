FROM openjdk:17
VOLUME /tmp
EXPOSE 9000
ADD ./server-gateway-0.0.1-SNAPSHOT.jar server-gateway.jar
ENTRYPOINT ["java","-jar","/server-gateway.jar"]