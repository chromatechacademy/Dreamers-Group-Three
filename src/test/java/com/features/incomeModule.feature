Feature: Income module

    @Moe @DG3-6
    Scenario: Income Module to include 
        Given user is on the CTSMS login page
        When user logs in with username "general@teacher.com" and password "123456"
        Then user will have to click on section "income"

