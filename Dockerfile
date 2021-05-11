FROM openjdk:8
ADD target/helloWorld-0.0.1-SNAPSHOT.jar helloWorld-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/helloWorld-0.0.1-SNAPSHOT.jar"]