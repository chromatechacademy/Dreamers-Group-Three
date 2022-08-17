Feature: Verifying Classes and Sections


    @Diego @DG3-11 @Smoke
    Scenario: CTSMS - Class and Sections Verification
        Given user is one the CTSMS login page
        When user logs with username "general@teacher.com" and password "123456"
        And navigates to Academics module
        And navigates to Class module
        Then Class "Cyber Security" displays with class sections
            """
            Networking Fundamentals
            Linux Fundamentals
            CIA Triad
            Penetration Testing/Ethical Hacking
            """
        Then Class "SDET" displays with the following class sections
            """
            Testing Fundamentals
            SDLC Methodologies
            Selenium Test Automation
            Cucumber Fundamentals
            API Testing
            Git/GitHub
            Java 11 for Cool People
            Mobile Test Automation
            Accessibility Testing
            Database Testing
            """

    @Smoke
    Scenario: CTSMS - Ability to add and delete sections
        Given user is one the CTSMS login page
        When user logs with username "general@teacher.com" and password "123456"
        And navigates to Academics module
        And navigates to sections module
        And adds section "DYNAMIC XPATH EXAMPLE"
        And deletes sections "DYNAMIC XPATH EXAMPLE"