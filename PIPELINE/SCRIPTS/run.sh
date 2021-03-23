#!/bin/bash -xe
cp /opt/DS/context$RUNTIME_ENVIRONMENT.xml /tmp/context.xml
ls -lhrst /tmp /opt/TOMCAT /opt/TOMCAT/conf 
mv /tmp/context.xml /opt/TOMCAT/conf/ 



if [ $RUNTIME_ENVIRONMENT == "DESA" ]; then
    export PROXY=proxydesa
elif [ $RUNTIME_ENVIRONMENT == "TEST" ];then
    export PROXY=proxydesa
elif [ $RUNTIME_ENVIRONMENT == "PREPROD" ];then
    export PROXY=proxysrv
else
    export PROXY=proxysrv
fi

ln -sf /usr/share/zoneinfo/America/Buenos_Aires  /etc/localtime
echo "CONFIGURACIONES JVM"
export JAVA_OPTS="$JAVA_OPTS -Dhttp.nonProxyHosts='*.test.cba.gov.ar|*.cba.gov.ar' -Dhttp.proxyHost=$PROXY -Dhttp.proxyPort=8080 -Dhttps.proxyHost=$PROXY -Dhttps.proxyPort=8080"
export JAVA_OPTS="$JAVA_OPTS -Djava.security.egd=file:///dev/urandom -Djava.net.preferIPv4Stack=true -XX:PermSize=256m -XX:MaxPermSize=256m -Xms1024m -Xmx1024m -server -XX:NewRatio=3 -XX:SurvivorRatio=6 -Xss512K -verbose:gc -XX:+PrintGCDateStamps -XX:+PrintGCDetails -Duser.timezone=GMT-3"
export JAVA_HOME='/opt/JDK'
export JRE_HOME='/opt/JDK'
export PATH=$JAVA_HOME/bin/java:$PATH
/opt/TOMCAT/bin/catalina.sh run >> /opt/TOMCAT/logs/catalina.log


