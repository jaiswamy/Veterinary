FROM maven:3.6.3-jdk-8 AS BUILD_IMAGE
RUN git clone git@github.com:jaiswamy/Veterinary.git
RUN cd Veterinary && cd VETBIDATCOL && mvn install


FROM tomcat:9-jdk8
LABEL "Project"="VETBIDATCOL"
LABEL "Author"="Jai"

RUN rm -rf /usr/local/tomcat/webapps/*
WORKDIR /usr/local/tomcat/
COPY --from=BUILD_IMAGE Veterinary/VETBIDATCOL/target/VETBIDATCOL.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
CMD ["catalina.sh", "run"]



