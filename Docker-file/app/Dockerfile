FROM tomcat:9-jdk8-openjdk-slim
LABEL "Project"="VETBIDATCOL"
LABEL "Author"="Jai"

RUN rm -rf /usr/local/tomcat/webapps/*
WORKDIR /usr/local/tomcat/
COPY  UniversityResearchManagementSystem-0.1.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]



