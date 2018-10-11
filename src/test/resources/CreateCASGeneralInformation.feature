@run
Feature: Verify device CAS set General information

  Scenario: As an end user I want to change the General details for a device
    #Given user is logged in as user "Enexis_General" and password "DukeS01"
    Given user is logged in as user "Enexis_TomWiggers" and password "pBZbuPnJTD"
    When user sees "Dashboard" overview page
    Then user clicks on "Devices" under the "MultiSense" main menu
    When user sees "Devices" overview page
    Then user selects "Device group" under the "Device groups" object
    And user clicks on "TestGroupTom" under Device groups
    And user selects "TestDeviceTom" in a list overview
    And user clicks on "Device attributes" of the object menu
    When user sees "Device attributes" overview page
    Then user wants to change the information i click on Edit "General" under the "Actions" button
    Then user changes the Values from old value to new value
      | object               | value             |
      | Construction Year    | 2017             |
      | Equipment Identifier | 12006372618392817 |
    And user clicks on the "Save" button
    When user sees "Device attributes" overview page
    Then user verifies if the below attributes has the correct values
      | object  | attribute            | value             |
      | General | Construction Year    | 2018              |
      | General | Equipment Identifier | 12006372618392817 |
