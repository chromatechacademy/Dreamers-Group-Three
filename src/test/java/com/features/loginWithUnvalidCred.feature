Feature: user should not be able to login with invalid credentials. 

    @Moe @DG3-2
    Scenario: user shouldnt be able to login with invalid credential
        Given  the user is on the CTSMS login page
        When user logs in with invalid username "general5@gmail.commm" and password "09876"
        Then user should not be able to be logged in to "Chroma Tech Academy"




