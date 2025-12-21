@echo off

echo Changing directory backend...
cd "WebTaskAPI"

echo Docker login...
docker login

echo Building Docker image api...
docker build -t task-api . 

echo Tagging Docker image api...
docker tag task-api:latest 0taras0/task-api:latest

echo Pushing Docker image api to repository...
docker push 0taras0/task-api:latest

echo Done ---api---!
pause
 