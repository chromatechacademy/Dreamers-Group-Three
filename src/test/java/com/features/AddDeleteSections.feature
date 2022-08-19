Feature: Ability to add and delete sections

    Description: CTSMS - Ability to add and delete sections

    @DG3-17 @Serge @Smoke
    Scenario: CTSMS - Ability to add and delete sections
        Given the teacher is located on the CTSMS login webpage
        When the teacher uses username "general@teacher.com" and password "123456" and by expanding the Human Resource tab
        And the teacher clicks on Academic section
        And navigates to Sections module
        And enters the new section By entering "New Section Name" in Add Section folder and Clicks Save
        Then the teacher deletes the Newly created section "New Section Name"

        
        
        