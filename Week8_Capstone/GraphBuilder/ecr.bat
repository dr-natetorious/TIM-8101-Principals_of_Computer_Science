aws ecr get-login --no-include-email --region us-west-2 > %temp%\aws-login.bat
@CALL %temp%\aws-login.bat

docker build -t apk-decompile .
docker tag apk-decompile:latest 293718918760.dkr.ecr.us-west-2.amazonaws.com/apk-decompile:latest
docker push 293718918760.dkr.ecr.us-west-2.amazonaws.com/apk-decompile:latest