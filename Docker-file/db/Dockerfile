FROM mysql:5.6.20
LABEL "Project"="VETBIDATCOL"
LABEL "Author"="Jai"

ENV MYSQL_ROOT_PASSWORD="veturms@HitpL2025"
ENV MYSQL_DATABASE="db_veturmsn"
ENV MYSQL_USERNAME="veturms"


ADD veturms.sql docker-entrypoint-initdb.d/veturms.sql