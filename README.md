# Ironhackbank
Final Project
## Description
A REST API for managing different types of bank accounts, including checking and savings accounts.

## Class Diagram
![Class Diagram]
(https://lucid.app/lucidchart/4e2e89b8-a9e3-4898-ba3f-cf62ec4ec653/edit?beaconFlowId=DEC7F47F6B2D90E2&invitationId=inv_1b762818-ceab-4ddc-abec-b5dc799dde6f&page=.Q4MUjXso07N#)
(![image](https://github.com/user-attachments/assets/a0a0d3ad-1bca-47a8-816d-4b8bad2a226e) )

## Setup
1. Clone the repository.
2. Configure your database in application.properties.
3. Run the application using mvn spring-boot:run.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Spring Security
- MySQL
- JUnit

## Controllers and Routes
- GET /api/accounts - Retrieve all accounts
- POST /api/accounts - Create a new account
- PUT /api/accounts/{id} - Update an account
- DELETE /api/accounts/{id} - Delete an account

## Extra Links
- [Trello Board]((https://trello.com/b/aQvIufUm/ironhack-final-project))
- [Presentation Slides](https://calendly.com/salvatore-corsaro-ironhack/15min?month=2024-07)

## Future Work
- Add more account types
- Implement advanced security features
