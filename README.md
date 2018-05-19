## Usage
Clone the project and run: 
```bash 
gradlew bootRun
```
You'll see the running time of methods in milliseconds in the logs:
```
2018-05-19 20:49:03.819 TRACE 12964 --- [           main] com.helmes.aop.AppService                : StopWatch 'com.helmes.aop.AppService.longRunningService': running time (millis) = 1974
2018-05-19 20:49:03.820 TRACE 12964 --- [           main] ication$$EnhancerBySpringCGLIB$$3825cf74 : StopWatch 'com.helmes.aop.AopApplication.run': running time (millis) = 1982
```
