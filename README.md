# Fluffy Best
fluffy-best is a Spring Boot REST API backend service. It is designed to serve for an Angular frontend. 

## Database setup
The application persists its data to a database. It currently uses MySQL as database server.
For Flyway database migrations to kick in you must provide connection credentials of an existing user in application.yml
An example SQL script for creating a database user in given is /resources/db/mysql/create-user.sql

