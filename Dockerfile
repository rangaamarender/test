# Use the official Tomcat base image
FROM tomcat:10.1.9

# Copy the WAR file to the webapps directory
COPY recruit-0.0.1-SNAPSHOT.war /opt/tomcat/webapps/

# Expose the default Tomcat port
EXPOSE 8080

# Start Tomcat when the container launches
CMD ["catalina.sh", "run"]
