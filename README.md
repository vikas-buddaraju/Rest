# Rest
-----------------------
Sysnopsys
-----------------------
This messenger App is devolped by using REST and Jersey. The messenger app basically exposess three resuources Profiles, messages and comments. profiles and messages are implementedd as seprerate resources as they dont depend on each other, but comments is implemented as sub resource for messages because for each message there would be one or more comments(similar to facebook posts)
-----------------------
Instalation
-----------------------
Download the project and import it to eclipse and add jersey jars to class path, it is best to have the postman Rest API client to test the project, URI to hit will be provide below in test section. You don't need to connect to any database since I am storing everyting in memory as map(for EX- if you are creating a new message using post it will stored in the map and you will able to retrieve it through GET operation as long as you are in same instance, but if the server is restarted you will loose the instance)
----------------------
Test
----------------------
Profiles - URI - http://localhost:8080/messenger/webapi/profiles
           operations enables - GET -http://localhost:8080/messenger/webapi/profiles/1 - To get profile with specific id
                                POST - http://localhost:8080/messenger/webapi/profiles - to create new profile
                                PUT - http://localhost:8080/messenger/webapi/profiles/1 - to update profile with specific id
                                DELETE - http://localhost:8080/messenger/webapi/profiles/1 - to update profile with specific id
           Example output for GET operation - 
[
    {
        "firstName": "Vikas",
        "id": 1,
        "lastName": "Buddaraju",
        "profileName": "Vikas"
    }
]

Messages - URI - http://localhost:8080/messenger/webapi/messages
           operations enables - GET -http://localhost:8080/messenger/webapi/messages/1 - To get messages with specific id
                                POST - http://localhost:8080/messenger/webapi/messages - to create new messages
                                PUT - http://localhost:8080/messenger/webapi/messagges/1 - to update messages with specific id
                                DELETE - http://localhost:8080/messenger/webapi/messages/1 - to update messages with specific id
           Example output for GET operation - 
[
    {
        "author": "Vikas",
        "created": "2016-12-12T11:15:45.972",
        "id": 1,
        "message": "Hello World"
    },
    {
        "author": "Vikas",
        "created": "2016-12-12T11:15:45.972",
        "id": 2,
        "message": "Hello Jersey"
    }
    
 Comments - URI - http://localhost:8080/messenger/webapi/messages/1/comments(comments is sub resource of messages because it depents on it)
           operations enables - GET -http://localhost:8080/messenger/webapi/messages/1/comments/1 - To get comments with specific id
                                POST - http://localhost:8080/messenger/webapi/messages1/comments - to create new comments
                                PUT - http://localhost:8080/messenger/webapi/messagges/1/comments - to update comments with specific id
                                DELETE - http://localhost:8080/messenger/webapi/messages/1/comments - to update comments with specific id



