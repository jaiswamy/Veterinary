FROM mysql:5
LABEL "Project"="VETBIDATCOL"
LABEL "Author"="Jai"

ENV MYSQL_ROOT_PASSWORD="veturms@HitpL2025"
ENV MYSQL_DATABASE="db_veturmsn"
ENV MYSQL_USERNAME="veturms"
ENV MYSQL_PASSWORD="veturms@HitpL2025"

COPY veturms.sql /docker-entrypoint-initdb.d/veturms.sql
EXPOSE 3306
