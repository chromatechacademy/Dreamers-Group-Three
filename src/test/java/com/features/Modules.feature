Feature: Modules displayed

    Feature Description:

    @Smoke  @DG3-3 @Eugene
    Scenario: All modules displayed
        Given user access ChromaTech website
        When user enters the Username "general@teacher.com"
        And User enters password "123456"
        And User clicks Sign in button
        Then the modules display



    @Smoke  @DG3-10 @Eugene
    Scenario: HomeWork module displayed
        Given user access ChromaTech website
        When user enters the Username "general@teacher.com"
        And User enters password "123456"
        And User clicks Sign in button
        And User clicks HomeWork module
        Then Add HomeWork module displays


    #Progression tag needs for testing pupropses, as soon as you done with a test Scenario you need to delete Progression

    @Smoke  @DG3-7 @Eugene
    Scenario: Expenses module displayed
        Given user access ChromaTech website
        When user enters the Username "general@teacher.com"
        And User enters password "123456"
        And User clicks Sign in button
        And User clicks on the Expenses module
        Then the Expenses modules are display




