<<<<<<< HEAD
FROM tomcat:9-jdk8-openjdk-slim
=======
FROM tomcat:9-jdk8
>>>>>>> 14d887055b98e58c0ef909bafa217aa75402da3e
LABEL "Project"="VETBIDATCOL"
LABEL "Author"="Jai"
WORKDIR /usr/local/tomcat/webapps/
RUN rm -rf /usr/local/tomcat/webapps/*
<<<<<<< HEAD
WORKDIR /usr/local/tomcat/
COPY  UniversityResearchManagementSystem-0.1.war /usr/local/tomcat/webapps/ROOT.war
=======
COPY UniversityResearchManagementSystem-0.1.war /usr/local/tomcat/webapps/ROOT.war

>>>>>>> 14d887055b98e58c0ef909bafa217aa75402da3e
EXPOSE 8080
CMD ["catalina.sh", "run"]



