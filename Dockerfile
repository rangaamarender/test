# Use the official Tomcat base image
FROM tomcat:10.1.9

#working dirctory for tomcat
WORKDIR /opt/tomcat

# Copy the WAR file to the webapps directory
COPY ./*.recruit-0.0.1-SNAPSHOT /opt/tomcat/webapps

# Expose the default Tomcat port
EXPOSE 8080
