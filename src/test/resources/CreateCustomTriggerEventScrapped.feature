@run
  Feature: Create custom trigger event Scrapped

    Scenario: As a user I want to verify the event Scrapped to a device life cycle
      Given user is logged in as user "Enexis_TomWiggers" and password "pBZbuPnJTD"
      When user sees "Dashboard" overview page
      Then user clicks on "Administration" under the "MultiSense" main menu
      When user sees "Administration" overview page
      Then user selects "Device management" under the "Device life cycles" object
      When user sees "Device life cycles" overview page
      And user selects "Master Device Life Cycle" in a list overview
      And user clicks on "States" of the object menu
      Then user verifies if the objects has the correct values
        | Object                | Value                                |
        | Scrapped              | Post-operational                     |
        | Decommissioned        | Operational                          |



