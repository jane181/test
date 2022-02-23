FROM openjdk:15
WORKDIR /app/
COPY ./* ./
RUN javac main.java
