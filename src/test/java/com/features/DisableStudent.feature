Feature: Ability to disable student records

    Description: Testing the ability to disable student records after it's creation

   ## Manny's code

    @DG3-15b
    Scenario: CTSMS - Ability to disable student records
        Given the teacher is on the Student Details page
        When the teacher clicks Search after Selecting SDET option from Class dropdown menu, Selecting Testing Fundamentals from Section dropdown menu
        And the teacher clicks on student Serge with Amission No 0390
        And clicks the red thumbs down icon in the upper right corner
        And clicks OK on the Google Chrome pop up alert with the Text - Are you sure you want to disable this record.
        And clicks Save after selecting the TestDisableReason in the Reason drop down menu and enters "GROUP 1 TEST" text in Note window
        And the teacher navigates to the Disaled Students menu option and, Selecting SDET option from Class dropdown menu, Selecting Testing Fundamentals from Section dropdown menu, clicks Search
        Then the teacher should see the name of the disabled student in the Disabled Students page


