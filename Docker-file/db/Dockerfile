FROM mysql:5
LABEL "Project"="VETBIDATCOL"
LABEL "Author"="Jai"

ENV MYSQL_ROOT_PASSWORD="mysqlroot"
ENV MYSQL_DATABASE="db_veturmsn"
ENV MYSQL_USERNAME="veturms"
ENV MYSQL_PASSWORD="veturms@HitpL2025"

COPY veturmsn.sql /docker-entrypoint-initdb.d/veturmsn.sql
EXPOSE 3306
