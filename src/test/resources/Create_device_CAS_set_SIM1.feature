@run
Feature: Create device CAS set SIM

  Scenario: As an end user i want to add the SIM details for a device
    Given I go to the "devices" page of "multisense" and login as user AutoTest
    Then user sees "Devices" overview page
    Then user selects "Device groups" under the "Device group" object
    And user clicks on "Test Ruben" under Device groups
    And user selects "TestDeviceTom" in a list overview
    And user clicks on "Device attributes" of the object menu
    When user sees "Device attributes" overview page
    And user selects "Versions" in a list overview
    Then user clicks on "Add version" button
    When user sees "Add 'SIM' version" overview page
    Then user enters the following values
      | object   | value               |
      | Status   | Active              |
      | ICCID    | 55555555799         |
      | Provider | Telfort             |
      | Format   | Embedded-SIM (eSIM) |
      | Batch    | 122288882           |
      | IMSI     | 2288888880          |
    And user clicks on "Add"
    Then user clicks on "Device attributes"
    Then user verifies if the below attributes has the correct values
      | object | attribute | value               |
      | SIM    | Status    | Active              |
      | SIM    | ICCID     | 55555555799         |
      | SIM    | Provider  | Telfort             |
      | SIM    | Format    | Embedded-SIM (eSIM) |
      | SIM    | Batch ID  | 122288882           |
      | SIM    | IMSI      | 2288888880          |


