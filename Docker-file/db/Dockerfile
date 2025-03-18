FROM mysql:5
LABEL "Project"="VETBIDATCOL"
LABEL "Author"="Jai"

ENV MYSQL_ROOT_PASSWORD="mysql123"
ENV MYSQL_DATABASE="urms"
ENV MYSQL_USERNAME="root"
ENV MYSQL_PASSWORD="mysql123"

COPY veturms.sql /docker-entrypoint-initdb.d/veturms.sql
EXPOSE 3306
