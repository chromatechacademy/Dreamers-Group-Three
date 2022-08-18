Feature: user should not be able to login with invalid credentials.

    @DG3-2
    Scenario: user shouldnt be able to login with invalid credential
        Given  the user is on the CTSMS login page
        When user logs in with invalid username "general@teacher.comm" and password "1234567"
        Then user should not be able to be logged in to "Chroma Tech Academyyy"




