FROM tomcat:9.0.82-jdk8-temurin
LABEL "Project"="VETBIDATCOL"
LABEL "Author"="Jai"

WORKDIR /usr/local/tomcat/webapps/
RUN rm -rf ROOT*
COPY UniversityResearchManagementSystem-0.1.war ROOT.war
RUN chmod 644 ROOT.war
RUN curl -o /usr/local/tomcat/lib/mysql-connector-java-8.0.33.jar \
    https://repo1.maven.org/maven2/mysql/mysql-connector-java/8.0.33/mysql-connector-java-8.0.33.jar

EXPOSE 8080
CMD ["catalina.sh", "run"]



