# Use the official Tomcat base image
FROM tomcat:10.1.9

#working dirctory for tomcat
C:\Program Files\Apache Software Foundation\Tomcat 10.1_Tomcat10.1.8\webapps

# Copy the WAR file to the webapps directory
COPY test/target/recruit-0.0.1-SNAPSHOT.war C:\Program Files\Apache Software Foundation\Tomcat 10.1_Tomcat10.1.8\webapps

# Expose the default Tomcat port
EXPOSE 8080
