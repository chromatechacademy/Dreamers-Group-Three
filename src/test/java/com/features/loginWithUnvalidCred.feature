Feature: user should not be able to login with invalid credentials. 

    @Moe @DG3-2 @Smoke
    Scenario: user shouldnt be able to login with invalid credential
        Given  the user is on the CTSMS login page
        When user logs in with valid username "general@teacher.com" and password "123456"
        Then user should be able to be logged in to "Chroma Tech Academy"




