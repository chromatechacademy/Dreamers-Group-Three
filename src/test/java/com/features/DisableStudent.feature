Feature: Ability to disable student records

    Description: Testing the ability to disable student records after it's creation

    @DG3-15a
    Scenario: CTSMS - Creation of new Student Record
        Given a teacher is on the login page of the CTSMS website
        When the teacher uses as login credentials the username "general@teacher.com" and password "123456"
        And navigates to Student Information menu option
        And after clicks on Student Admission
        And enters "0390" for Admission No 
        And selects Class "SDET" option from Class dropdown menu
       # And selects Testing Fundamentals from Section dropdown menu, 
       # And enters "Serge" for First Name,
       # And selects Male from Gender dropdown menu,
       # And enters the DOB "09/30/1985" in the Date of Birth field,
       # And clicks radio button Father in If Guardian is,
       # And enters "Alex" for Guardian Name,
       # And enters "17182882215" for Guardian Phone
       # Then the teacher clicks on the Save Button, creating a new student record

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


