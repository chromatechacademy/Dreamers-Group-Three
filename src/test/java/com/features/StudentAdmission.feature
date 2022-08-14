Feature: Feature Student Admission

    Feature Description:

    @Progression
    Scenario Outline: Admitting Student
        Given user is on chroma tech website
        When the teacher is logging in with username "general@teacher.com" and password "123456"
        And user clicks Student Information
        And user clicks on Student Admission
        And admits student with the information "<admissionNumber>","<firstName>","<rollNumber>","<lastName>","<studentClass>","<gender>","<section>","<dateOfBirth>","<category>","<email>","<admissionDate>","<bloodGroup>","<asOnDate>","<mobileNumber>","<height>","<weight>"
        And selects other for guardian
        And enters guardian information "<fatherName>","<fatherPhone>","fatherOccupation","<motherName>","<motherPhone>","<motherOccupation>","<guardianName>","<guardianRelation>","<guardianEmail>","<guardianPhone>","<guardianOccupation>","<guardianAdress>"
        Examples:
            | admissionNumber | firstName | rollNumber | lastName | studentClass | gender | section     | dateOfBirth | category       | email                | admissionDate | bloodGroup | asOnDate   | mobileNumber | height | weight | fatherName | fatherPhone | fatherOccupation | motherName | motherPhone | motherOccupation | guardianName | guardianRelation | guardianEmail   | guardianPhone | guardianOccupation | guardianAdress    |
            | 548             | Phil      | 123456     | Gonzales | SDET         | Male   | API Testing | 02/07/1997  | Testing sample | yeeyee@yahoomail.com | 08/02/2022    | O+         | 08/09/2022 | 7738547913   | 120in  | 125lbs | Luis       | 9081235876  | Window Cleaner   | Josefina   | 4568527984  | House Wife       | Jose         | Brother          | wahoo@gmail.com | 9075421764    | Power Washer       | 458 Rodensdale ln |


