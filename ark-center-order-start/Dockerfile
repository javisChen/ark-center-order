FROM openjdk:11-oraclelinux8
WORKDIR /app
COPY ./target/ark-center-order.jar /app
EXPOSE 8080
ENV SYS_OPT=""
ENTRYPOINT java $SYS_OPT -jar /app/ark-center-order.jar
