@run
Feature: Create device CAS set SIM

  Scenario: As a end user i want to change the SIM details for a device
    Given That i am on logged in as user "XXX" and password "XXX"
    When I  see my "Dashboard" overview page
    Then I click on "Devices" under the "Multisense" main menu
    And I should see the "Devices" overview page
    When  I Select "Devicegroups" under the "Device" object
    Then I click on "WouterGroep" under  "Device groups"
    And I select "Woutermeter" in a listoverview
    And I click on "Device attributes"
    And I click on the "Actions" button

    When I click on "Edit SIM"
    Then I should see the "Edit SIM" overview page
    And I change the SIM "Status" in the dropdown from "Created" to "Active"
    And I change the SIM "ICCID" in the textfield from "555555557752" to "55555555799"
    And I change the SIM "Provider" in the textfield from "KPN" to "Telfort"
    And I change the SIM "Format" in the dropdown from "Full-size (1FF)" to "Mini-SIM (2FF)"
    And I change the SIM "Batch ID" in the dropdown from "122288882" to "122288999"
    And I change the SIM "IMSI" in the dropdown from "8888888880" to "2288888880"

    When I click on the "Save" button
    Then I should see the "Device attributes" overview page
    And I verify the "SIM" details and the "Status" should be "Active"
    And I verify the "SIM" details and the "ICCID" should be "55555555799"
    And I verify the "SIM" details and the "Provider" should be "Telfort"
    And I verify the "SIM" details and the "Format" should be "Full-size (1FF)"
    And I verify the "SIM" details and the "Batch ID" should be "122288999"
    And I verify the "SIM" details and the "IMSI" should be "2288888880"
