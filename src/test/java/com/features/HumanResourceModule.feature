Feature: Human Resource module testing

    Description: Testing the Human Resource to include specific modules

    @DG3-9
    Scenario: Login with valid credentials and navigating to Human Resource module
        Given the teacher is on the CTSMS login webpage
        When the teacher logs in with username "general@teacher.com" and password "123456" and by expanding the Human Resource tab
        Then the teacher should see the modules described under Description "Staff Directory", "Staff Attendance", "Payroll", "Approve Leave Request", "Apply Leave", "Leave Type", "Teachers Rating", "Department", "Designation"