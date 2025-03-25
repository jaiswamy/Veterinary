FROM tomcat:9.0.82-jdk8-temurin
LABEL "Project"="VETBIDATCOL"
LABEL "Author"="Jai"

WORKDIR /usr/local/tomcat/webapps/
RUN rm -rf ROOT*
COPY UniversityResearchManagementSystem-0.1.war ROOT.war
RUN chmod 644 ROOT.war
RUN curl -L -o mysql-connector-java-5.1.49.tar.gz https://dev.mysql.com/get/Downloads/Connector-J/mysql-connector-java-5.1.49.tar.gz && \
    tar -xzvf mysql-connector-java-5.1.49.tar.gz -C /usr/local/tomcat/lib/ && \
    rm /usr/local/tomcat/lib/mysql-connector-java-5.1.49.tar.gz

ENV DB_HOST=localhost
ENV DB_PORT=3306
ENV DB_NAME=db_veturmsn
ENV DB_USER=root
ENV DB_PASSWORD=mysql123

EXPOSE 8080
CMD ["catalina.sh", "run"]





