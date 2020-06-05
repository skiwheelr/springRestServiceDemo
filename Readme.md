To set up:
Ensure that Java 8 path is set
From package home, run ./mvnw clean package -X (flag for details)
From package home, run java -jar target/amex-0.0.1-SNAPSHOT.jar

Congiguration changes will need to be made to run on server including configuring server or container to have ports open
For more-user friendly experience, access these endpoints from a front-end webapplication on shared or distinct hosting

For Authentication, I would use one of the following methods:
Without using db:
https://kariera.future-processing.pl/blog/exploring-spring-boot-and-spring-security-custom-token-based-authentication-of-rest-services-with-spring-security-and-pinch-of-spring-java-configuration-and-spring-integration-testing/
Using db:
https://www.javadevjournal.com/spring/securing-a-restful-web-service-with-spring-security/

Authentication disabled due to token issue.
Developer recommendation: Build this in GO or Java using PLAY framework. 
