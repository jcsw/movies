# Movies API #

### Java Application to access AWS DynamoDB  ###

Build
```
./gradlew clean build
```

Run
```
./gradlew bootRun
```

To test
```
curl -X GET http://localhost:9050/movie/ac0206634/2006
```

To access actuator
```
http://localhost:9050/actuator
```