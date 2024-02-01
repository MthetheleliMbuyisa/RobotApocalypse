# RobotApocalypse
Rest API
To run the project check if you have JDK 21, you can download it from Oracle website https://www.oracle.com/java/technologies/downloads/
Download Intellij, you can download from the following site https://www.google.com/search?q=intellij+download&rlz=1C1GCEU_enZA1077ZA1077&oq=intelli&gs_lcrp=EgZjaHJvbWUqDAgBECMYJxiABBiKBTIGCAAQRRg5MgwIARAjGCcYgAQYigUyEggCEAAYQxiDARixAxiABBiKBTISCAMQABhDGIMBGLEDGIAEGIoFMgwIBBAAGEMYgAQYigUyDAgFEAAYQxiABBiKBTIGCAYQRRg9MgYIBxBFGD3SAQg0Mjc4ajBqNKgCALACAA&sourceid=chrome&ie=UTF-8

Download PostgreSQL, you can download from this link https://www.postgresql.org/download/
Download Postman (For API testing), you can download from this link https://www.postman.com/downloads/ 
Clone the project RobotApocalypse to your local machine 
Go to your downloads right click the project select open with Intellij
Once the project is open on intellij
Open the pgAdmin 4 on your start button 
Switch off Internet Security on Zscaler 
Open the database server when required to enter the password use the one you chose on your installation.
Go to the project on intellij and change the password under Application property to the one corresponding to database sever password.

Switch off Internet Security on Zscaler 
Run the project, open the web browser then access the API on localhost:8080/survivor
Open Postman, Go to Integration Testing underneath you can Test the following API’s POST under http: localhost8080/survivors go to build then underneath select raw input data your parameters are name, age, id, gender, infected, latitude, longitude ,water, ammunition, food, medication   , GET localhost:8080/survivor or specify by id localhost:8080/survivor/1
Test PUT localhost:8080/survivor/”id” update any survivor. The id is the primary key 
Test DELETE using localhost:8080/survivor/”id” to delete the survivor
Switch off the Zscaler 
Access the Robot Database on your website http://localhost:8080/robotAPI/robotCPU
The source code for Robot Database is  package Controller the class is RobotController
Go to postman Test GET enter url http://localhost:8080/robotAPI/robotCPU then send
you will get the database for Robots.


