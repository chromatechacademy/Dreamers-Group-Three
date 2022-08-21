Feature: login scenarios via Mobile

@DS3-21 @Smoke
Scenario: login with valid credentials using Mobile
Given user is on the CTSMS login page 
When user logs in with username "general@teacher.com" and password "123456"
Then user should be succesfully logged in to "Chroma Tech Academy" 