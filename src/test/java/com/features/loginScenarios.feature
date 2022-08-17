Feature: login scenarios 

@Moe @DG3-1 @smoke 
Scenario: login with valid credentials
Given user is on the CTSMS login page 
When user logs in with username "general@teacher.com" and password "123456"
Then user should be succesfully logged in to "Chroma Tech Academy" 