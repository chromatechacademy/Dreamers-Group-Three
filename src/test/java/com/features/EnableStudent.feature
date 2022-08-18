Feature: Enabling Student 


    @Progression 
    Scenario: User enable student 
    Given user access ChromaTech website
    When user enters the Username "general@teacher.com"
    And User enters password "123456"
    And User clicks Sign in button
    And User is on Disabled Student Page 
    And User select Class "SDET"
    And User select Section "Testing Fundamentals"
    And User clicks Search
    And User enables Student
    Then Student has been enabled
