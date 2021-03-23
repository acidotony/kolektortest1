export PROXY="http://10.250.5.8:8080/"
export https_proxy=$PROXY
export http_proxy=$PROXY
export no_proxy="10.250.10.65, ws.d250nt21.testcba.gov.ar"


RUNTIME_ENVIRONMENT=$1
PIPELINE_VERSION=$2


##WSREGISTRARPAGOSDC
docker stop -t0 $(docker ps -aq --filter "name=wsregistrarpagos-psrm") || true
docker rm $(docker ps -aq --filter "name=wsregistrarpagos-psrm") || true
##
DOCKER_LOGIN=`aws ecr get-login --no-include-email --region us-west-1`
time ${DOCKER_LOGIN}

docker run -d -p 20011:8080 --name wsregistrarpagos-psrm-${PIPELINE_VERSION} -e RUNTIME_ENVIRONMENT="$RUNTIME_ENVIRONMENT" -e https_proxy="http://10.250.5.8:8080/" -e http_proxy="http://10.250.5.8:8080/" -e no_proxy="10.250.10.65, ws.d250nt21.testcba.gov.ar, 10.250.10.44"   634937925704.dkr.ecr.us-west-1.amazonaws.com/wsregistrarpagosdc:"${PIPELINE_VERSION}"
