# spring-redis-postgres
Sample spring boot app for connecting to postgres RDS and redis

Steps to run -
1) Start AWS Postgres RDS and create database as "awsdb"
2) Start Elastic Cache with redis and copy the primary endpoint with port. If port is different than 6379, it means, you are using different config of elastic cache.
3) If port is 6582, you are having TLS mode enabled. Also look for cluster mode, if its enabled or disabled, as you need to pass them in spring boot app
4) In this example, we have TLS mode enabled, cluster mode disabled
5) Copy the github code to EC2 instance, which has Java and Maven pre-installed
6) Run the mvn clean build command to build the spring boot app
7) Run java -jar command to run the spring boot app
8) Monitor the logs to verify if get operation on user's which were created using post method are getting called from Redis in second hit, and DB in first hit


