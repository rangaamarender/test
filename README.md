# Development Guidelines


#### Contract Management

- all contract tables start with cntrct - Contact Tables


### Dev Setup/Tools

#### IDE/JDK
Eclipse - latest version
JDK - 17

Eclipse Plugin - https://ermaster.sourceforge.net/ for ER diagram and designing


#### Database:
Postgress 15.x
Pgadmin4 tool for Postgress 

To build code locally, you run following maven command, and make sure build passes with no errors
```
mvn clean install
```

To run application locally, run following command 
```
mvn spring-boot:run -Dspring-boot.run.arguments="--spring.profiles.active=localhost"
```