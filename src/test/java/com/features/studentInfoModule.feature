Feature: Student Info Module

    Feature Description: clicking on Student Information modules displaying more modules

    @pricila @StudentInfoModule @Progression
Scenario: Student information Module scenario
Given A user is logged into the ctsms website
When A user clicks on Student Information
Then "Student Information" Module displays the following modules:
"""
Student Details
Student Admission
Disabled Students
Bulk Delete
Student Categories
Student House
Disable Reason
"""