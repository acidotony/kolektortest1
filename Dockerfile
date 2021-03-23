FROM  
FROM registro.kolektor.com.ar:5000/jenkins_jdk8_tomcat8
COPY target/registrar-pagos-psrm-0.0.1-SNAPSHOT.war "/opt/TOMCAT/webapps/registrar-pagos-psrm-0.0.1-SNAPSHOT.war"
COPY PIPELINE/SCRIPTS/run.sh "/run.sh"
COPY PIPELINE/DS/ /opt/DS/
RUN chmod +x /run.sh
