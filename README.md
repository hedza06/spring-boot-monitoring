## Spring Boot Monitoring with Actuator, Prometheus and Grafana
This demo project illustrates usage of Spring Boot Actuator with Prometheus and Grafana, 
in order to create monitoring metrics for your application.

Monitoring is the process to gather metrics about the operations of an environment's hardware and software to 
ensure everything functions as expected to support applications and services.

Actuator endpoints let you monitor and interact with your application. Spring Boot includes a number of built-in 
endpoints and lets you add your own.

### Requirements
- Docker CE installed locally
- Java 17 and Maven 3.X.X

### Running the project
Here are the steps for running the project...

1. Point to the working directory
2. Run the project using the IntelliJ IDE
3. Point to the **docker** directory
4. Modify _docker-compose.yml_ file (watch for TODO section...)
5. Run command: `docker-compose up -d` and check for running containers

Main application Link: http://localhost:8080/  
Prometheus Link: http://localhost:9090/  
Grafana Link: http://localhost:3000/

### Endpoints for testing
Testing endpoint  
Method: GET  
Url: http://localhost:8080/api/execute

### Useful links to create dashboard for monitoring
Bellow are some useful links that will help you create dashboard with different metrics.

- https://www.youtube.com/watch?v=gJZhdEJvZmc&ab_channel=CodeboardClub (recommended)
- https://www.youtube.com/watch?v=w-c3KYKQQfs&ab_channel=edureka%21
- https://www.youtube.com/watch?v=4qpI4T6_bUw&ab_channel=SQL4automation
- https://www.youtube.com/watch?v=h4Sl21AKiDg&ab_channel=TechWorldwithNana

### Roadmap
- Adding connection to local database and monitor connection
- Create more Grafana Dashboards

### Contribution/Suggestions
If someone is interested in contribution or have some suggestions please contact me on e-mail `hedzaprog@gmail.com`.
It would be perfect if someone want to share Grafana Dashboards that are used for generating different metrics.

### Author
Heril Muratović  
Software Engineer  
<br>
**Mobile/Viber/WhatsUp**: +38269657962  
**E-mail**: hedzaprog@gmail.com  
**Skype**: hedza06  
**Twitter**: heril.muratovic  
**LinkedIn**: https://www.linkedin.com/in/heril-muratovi%C4%87-021097132/  
**StackOverflow**: https://stackoverflow.com/users/4078505/heril-muratovic