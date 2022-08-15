Feature: Fees Collection Module

    Feature Description: clicking on Fees Collection modules displaying more modules

    @pricila @DG3-5 @Progession
    Scenario: Fees Collection module scenario
        Given user is logged in on the CTSMS login page
        When A user clicks on Fees Collection
        Then "Fees Collection" displays the following modules
            """
            Collect Fees
            Search Fees Payment
            Search Due Fees
            Fees Master
            Fees Group
            Fees Type
            Fees Discount
            Fees Carry Forward
            Fees Reminder
            """




