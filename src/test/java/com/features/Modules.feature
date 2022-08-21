Feature: Modules displayed

    Feature Description:

    @Smoke @DG3-3 @Eugene
    Scenario: All modules displayed
        Given user access ChromaTech website
        When user enters the Username "general@teacher.com"
        And User enters password "123456"
        And User clicks Sign in button
        Then the following modules correctly display "Student Information", "Fees Collection", "Income", "Expenses", "Academics", "Human Resource", "Homework", "Reports"



    @Smoke @DG3-10 @Eugene
    Scenario: HomeWork module displayed
        Given user access ChromaTech website
        When user enters the Username "general@teacher.com"
        And User enters password "123456"
        And User clicks Sign in button
        And User clicks HomeWork module
        Then Add HomeWork module correctly displays "Add Homework"


    #Progression tag needs for testing pupropses, as soon as you done with a test Scenario you need to delete Progression

    @Smoke @Progression @DG3-7 @Eugene
    Scenario: Expenses module displayed
        Given user access ChromaTech website
        When user enters the Username "general@teacher.com"
        And User enters password "123456"
        And User clicks Sign in button
        And User clicks on the Expenses module
        Then the Expenses modules corectly display "Add Expense", "Search Expense", "Expense Head"




