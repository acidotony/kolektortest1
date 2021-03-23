#!/bin/bash -ex

cp PIPELINE/Dockerfile .
export AMBIENTE_TAG=${PIPELINE_VERSION}
export REGISTRY=634937925704.dkr.ecr.us-west-1.amazonaws.com
export APP=wsregistrarpagosdc

docker build --force-rm --rm --no-cache --tag=$REGISTRY/$APP:$AMBIENTE_TAG .

DOCKER_LOGIN=`aws ecr get-login --no-include-email --region us-west-1`
time ${DOCKER_LOGIN}
time docker push $REGISTRY/$APP:$AMBIENTE_TAG
