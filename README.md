# docker-ecs

**Manual Build of docker images**

mvn clean package -DskipTests

docker build -t $REPOSITORY_URI:$BRANCH_TAG .
`Eg : docker build -t test_repo_uri:dev .`

**List Docker images**

docker image ls
`REPOSITORY                                                   TAG                      IMAGE ID            CREATED             SIZE
 test_repo_uri                                                test                     058b37759d68        8 seconds ago       125MB`

**Remove Docker images**

docker rmi Image ID
`Eg : docker rmi 058b37759d68`

**Log into AWS ECR**

aws --version

$(aws ecr get-login --no-include-email --region ap-southeast-2)

**Push Docker Images to Container Registry**

docker push $REPOSITORY_URI:$BRANCH_LATEST
`Eg : docker push test_repo_uri:dev`


