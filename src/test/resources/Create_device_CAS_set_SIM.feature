@run
Feature: Create device CAS set SIM

  Scenario: As an end user i want to add the SIM details for a device
    Given That i am on logged in as user "Enexis_General" and password "DukeS01"
    Given That i am on logged in as user "Enexis_NasimBenbouchta" and password "SzrhapMkP9"
    When I  see my "Dashboard" overview page
    Then I click on "Devices" under the "MultiSense" main menu
    When I  see my "Devices" overview page
    Then I Select "Device group" under the "Device groups" object
    And I click on "Test Ruben" under Device groups
    And I select "merks_a" in a list overview
    When user sees "Device" overview page
    Then user clicks on "Device attributes"
    And user clicks on SIM "Versions"
    When user sees "History" overview page
    Then user clicks on "Add version"
    When user sees "Add 'SIM' version" page
    Then user enters the SIM "Status" in the dropdown to "Active"
    And user enters the SIM "ICCID" in the textfield to "55555555799"
    And user enters the SIM "Provider" in the textfield to "Telfort"
    And user enters the SIM "Format" in the textfield to "Mini-SIM (2FF)"
    And user enters the SIM "Batch ID" in the dropdown to "122288999"
    And user enters the SIM "IMSI" in the textfield to "2288888880"
    And user clicks on "Add"
    Then user clicks on "Device attributes"
    Then user verifies if the objects have the same name
      | Object | Status   | Active         |
      | SIM    | ICCID    | 55555555799    |
      | SIM    | Provider | Telfort        |
      | SIM    | Format   | Mini-SIM (2FF) |
      | SIM    | Batch ID | 122288999      |
      | SIM    | IMSI     | 2288888880     |
