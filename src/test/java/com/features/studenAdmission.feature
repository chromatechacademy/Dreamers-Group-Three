Feature: Student Admmission Number


    @DG3-13
    Scenario: Student Admission Unique admission number


        Given user is on the CTSMS login page
        When user logs in with username "general@teacher.com" and password "123456"
        And navigates to Student Information menu option
        And after clicks on Student Admission
        And enters "5565" for Admission No 
        And selects Class "SDET" option from Class dropdown menu
        And selects section "Testing Fundamentals" 
        And enters first name "Moe"
        And selects Gender "Male"
        And enters Date Of Birth "06/07/2001"
        And click on If Guardian Is "Father" 
        And enters "Max" in the Guardian Name text box
        And enters phone number "7033344343" 
        And click on save button 
        And enters "5565" for admission number
        And click again on save button 
        Then user is not be able to registor new student and "The Admission No field must contain a unique value." display page
        And user navigates to Bulk Delete menu
        And user select class SDET
        And user clicks on search button 
        And user checks the box with admission number "5565"
        And user clicks on Delete button 
        Then the student with unique number "5565" is not displayed

        