Feature: Ability to add and delete student categories

@Moe @DG3-20
Scenario: user should add and delete student from categories
Given user is on the CTSMS login page 
When user logs in with username "general@teacher.com" and password "123456"
And user clicks on section "Student Information"
And user then clicks on "Student Categories"
And enter "Moe" for Category 
And user clicks on the "Save" button 


@DG3-20
Scenario: user should be able to delete form the category
Given user is on the CTSMS login page 
When user logs in with username "general@teacher.com" and password "123456"
And user clicks on section "Student Information"
And user then clicks on "Student Categories"
And user should delete "Moe" 



