Feature: Sample


    # NOTE: YOU DO NOT NEED TO FOLLOW THE BELOW RULES BY FORCE, REMEMBER,
    #THE MAIN GOAL OF WRITING CUCUMBER SCENARIOS IS TO MAKE THE SCENARIO MAKE SENSE

    #WRITE YOUR SCENARIOS IN THIRD PERSON POINT OF VIEW(THE USERS POINT OF VIEW - NOT YOURS)
    @SampleRun
    Scenario: Sample scenario
        Given this step can be used to specify a pre-condition
    # When an action is made
    # Then this is where you write the expected result
    # And you can use this wherever needed to make your scenario make sense

    #USE SCENARIOS/SCENARIO OUTLINES TO HARDCODE
    Scenario: Example of hardcoding in scenario
        Given user is on the home page
        When user logs in with username "general@teacher.com" and password "123456"
        Then page displays with title "sample title"

    #PERFORM DATA DRIVEN TESTING USING A SCENARIO OUTLINE
    #EXECUTE THE SAME TEST CASE WITH DIFFERENT SETS OF DATA
    @Smoke
    Scenario Outline: Sample of scenario outline - login with different usernames and passwords
        Given user is on the home page
        When users logs in with username "<username>" and password "<password>"
        Then page displays with title "sample title"
        
        Examples:
            | username             | password |
            | general@teacher.com  | 123456   |
            | general1@teacher.com | 123456   |
            | general@teacher.com  | 123456   |
            | general1@teacher.com | 123456   |
            | general@teacher.com  | 123456   |
            | general1@teacher.com | 123456   |
            | general@teacher.com  | 123456   |
            | general1@teacher.com | 123456   |



