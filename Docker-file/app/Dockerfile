FROM tomcat:9-jdk8
LABEL "Project"="VETBIDATCOL"
LABEL "Author"="Jai"
WORKDIR /usr/local/tomcat/webapps/
RUN rm -rf /usr/local/tomcat/webapps/*
COPY UniversityResearchManagementSystem-0.1.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
CMD ["catalina.sh", "run"]



