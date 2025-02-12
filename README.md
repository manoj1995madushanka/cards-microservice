### We are generating docker image in cards service using google Jib
```mvn compile jib:dockerBuild```
```docker run -d -p 9000:9000 cards-service```