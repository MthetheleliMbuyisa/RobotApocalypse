# RobotApocalypse
Rest API (Robot Apocalypse Survivor Management System)
PC requirement to run the code.
JDK 21.0
IDE (preferably IntelliJ)
Postman (preferably latest version)
PostgreSQL (latest version)

Technology Stack
Java with Spring Boot for building REST API.
Spring Data JPA for data persistence.
REST Template for making HTTP requests to the robot CPU system.
Postman for API documentation.

Data Model
Survivors

Endpoints
POST http://localhost:8080/survivors - Endpoint to add survivor to the database.
GET http://localhost:8080/survivors - Endpoint to get all survivors from the database.
PUT http://localhost:8080/survivors/survivors/{{id}} - Endpoint to update a survivor by id.
GET http://localhost:8080/survivors/{{id}} - Endpoint to get the survivor by id.
GET http://localhost:8080/robotAPI/original_robot_Data - Endpoint to get all the robots.
GET http://localhost:8080/robotAPI/sortedApocalypesRobots - To get sorted Robots from Flying to Land.
PUT http://localhost:8080/survivors/report_Contamination/{{id}} - Endpoint to update the number of times a survivor has been contaminated.
GET http://localhost:8080/infected/disinfected - Endpoint to get the survivors who are not infected
GET http://localhost:8080/infected/disinfected-percentage - Endpoint to get the percentage of the survivors who are not infected.
GET http://localhost:8080/infected/infected - Endpoint to get the survivors who are  infected
GET http://localhost:8080/infected/reports/infected-percentage - Endpoint to get the percentage of the survivors who are infected.

Testing
Use Postman for unit testing, Content of a request – Body, Sub-option – Raw, Format JSON.
The parameters are entered as follows.

    {
        "id": 1,
        "name": "Mthetheleli",
        "age": 29,
        "gender": "male",
        "contamination": 3,
        "infected": true,
        "water": true,
        "food": false,
        "medication": false,
        "ammunition": false,
        "lastLocation": {
            "latitude": 41.89,
            "longitude": 33.98
        }






