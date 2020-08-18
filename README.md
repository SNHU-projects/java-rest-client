# java-rest-client
This project is a simple REST client application using the Dropwizard framework.

Find The Gaming Room Design Document [here](CS-230-Project-Software-Design-Document.docx).

## How to start the GameAuth application

1. Run `mvn clean install` to build your application
2. Start application with `java -jar target/gameauth-0.0.1-SNAPSHOT.jar server config.yml`
3. To check that your application is running enter url `http://localhost:8080`

### User roles

Usernames:

- Guest
- User
- Player
- Admin

Password: password

## Health Check

To see your applications health enter url `http://localhost:8081/healthcheck`


## Assignment 8-2 

### Briefly summarize The Gaming Room client and their software requirements. Who was the client? What type of software did they want you to design?

The Gaming Room currently has an Android-only game, Draw It or Lose It. They are interested in developing web-based versions of this game that serves multiple platforms. Development environments will need to be set up for Mac, Linux, Windows, and mobile devices. This project will use client-server architecture. One specific design pattern to note, only single games can be played at a time. The singleton design pattern will be used to prevent multiple games from existing in memory at any given time. As for gameplay, games allow for one to many teams to be involved, teams can have one to many players, and game and team names must be unique.
    
### What did you do particularly well in developing this documentation?

I maintained perspective over the entire project. I made architetural recommendations for file storage, database, backend, and client needs.

### What about the process of working through a design document did you find helpful when developing the code?

The design document required that I work through each aspect of the application in a way I had not previously done for a project. Particularly, the Development Requirements section needed considerable thought to work through all the important details.

### If you could choose one part of your work on these documents to revise, what would you pick? How would you improve it?

I would like to revise the Recommendations. With additinal feedback and research, there are changes I would like to make regarding security for the application.

### How did you interpret the user’s needs and implement them into your software design? Why is it so important to consider the user’s needs when designing?

Seeing as how addressing the users' needs was my chief assignment on this project, I found it very important to make sure they were met. I interpreted them based on my application development knowledge and sought out additional answers to solve the problems they were seeking answers for.

### How did you approach designing software? What techniques or strategies would you use in the future to analyze and design a similar software application?

I approached the software design process through an implementation plan. This allowed me to step through each portion of the application and address development concerns in step.