@run
Feature: Create device CAS set SIM

  Scenario: As an end user i want to add the SIM details for a device
    #Given That i am on logged in as user "Enexis_General" and password "DukeS01"
   Given That i am on logged in as user "Enexis_NasimBenbouchta" and password "SzrhapMkP9"
   When I  see my "Dashboard" overview page
   Then I click on "Devices" under the "MultiSense" main menu
   When I  see my "Devices" overview page
   Then I Select "Device group" under the "Device groups" object
   And I click on "Test Ruben" under Device groups
   And I select "merks_a" in a list overview
   When I  see my "Overview" overview page
   And I click on "Device attributes" of the object menu
   When I  see my "Device attributes" overview page
    And I select "Versions" in a list overview
