Feature: MOBILE - Mobile responsiveness

@DG3-25 @Serge @Smoke
Scenario: As a Chroma Tech faculty member or any user who can access the Chroma Tech School Management System, I want to be able to have a pleasant user experience without any issues.
Given a teacher is on the CTSMS login webpage
When the teacher logs in with username "general@teacher.com" and password "123456" and by expanding the Academics tab
Then the teacher should see the modules described in Description "Class Timetable", "Teachers Timetable", "Assign Class Teacher", "Promote Students", "Subject Group", "Subjects", "Class", "Sections"


