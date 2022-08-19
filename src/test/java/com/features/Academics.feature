Feature: Academics Module Testing

    Description: Testing the Academics module to include specific modules

    @DG3-8 @Serge @Smoke
    Scenario: Login with valid credentials and navigating to Academics module
        Given a teacher is on the CTSMS login webpage
        When the teacher logs in with username "general@teacher.com" and password "123456" and by expanding the Academics tab
        Then the teacher should see the modules described in Description "Class Timetable", "Teachers Timetable", "Assign Class Teacher", "Promote Students", "Subject Group", "Subjects", "Class", "Sections"