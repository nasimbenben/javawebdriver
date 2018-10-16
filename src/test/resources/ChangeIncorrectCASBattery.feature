@run
Feature: Verify incorrect device CAS set Battery information

  Scenario: As an end user i want to add unaccepted the Battery details for a device and verify if they are not saved.
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
    Then user wants to change the information i click on Edit "Battery" under the "Actions" button
    Then user changes the Values from old value to new value
      | object       | value |
      | Battery type | 123   |
      | Battery replacement date |   234 |

