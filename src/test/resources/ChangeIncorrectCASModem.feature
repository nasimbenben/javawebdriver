@run
Feature: Verify incorrect device CAS set Modem information

  Scenario: As an end user i want to add unaccepted the Modem details for a device and verify if they are not saved.
    Given user is logged in as user "Enexis_TomWiggers" and password "pBZbuPnJTD"
    When user sees "Dashboard" overview page
    Then user clicks on "Devices" under the "MultiSense" main menu
    When user sees "Devices" overview page
    Then user selects "Device group" under the "Device groups" object
    And user clicks on "TestGroupTom" under Device groups
    And user selects "TestDeviceTom" in a list overview
    And user clicks on "Device attributes" of the object menu
    When user sees "Device attributes" overview page
    Then user wants to change the information i click on Edit "Modem" under the "Actions" button
    Then user changes the Values from old value to new value
      | object        | value                           |
      | Communication | 1234567890123456789012345678901 |
      | IMEI          | 12345678901234567               |
    And user clicks on the "Save" button
    When user sees "Edit 'Modem'" overview page
    Then user sees the message under "IMEI" the error message "Field must not exceed 16 characters."
    Then user sees the message under "Communication module-ID" the error message "Field must not exceed 30 characters."
    Then user changes the Values from old value to new value
      | object        | value |
      | Communication | 12345 |
      | IMEI          | 123   |
    And user clicks on the "Save" button
    And user clicks on "Device attributes" of the object menu
    When user sees "Device attributes" overview page
    Then user verifies if the below attributes has not the incorrect values
      | object | attribute     | value                           |
      | Modem  | Communication | 1234567890123456789012345678901 |
      | Modem  | IMEI          | 12345678901234567               |
