@run
Feature: Verify device CAS set SIM information

  Scenario: As a end user i want to change the SIM details for a device
    #Given That i am on logged in as user "Enexis_General" and password "DukeS01"
    Given That i am on logged in as user "Enexis_NasimBenbouchta" and password "SzrhapMkP9"
    When I  see my "Dashboard" overview page
    Then I click on "Devices" under the "MultiSense" main menu
    When I  see my "Devices" overview page
    Then I Select "Device group" under the "Device groups" object
    And I click on "Test Ruben" under Device groups
    And I select "RonMeter" in a list overview
    And I click on "Device attributes" of the object menu
    When I  see my "Device attributes" overview page
    Then I verify if the objects has the correct values
      | Object                | Value                                |
      | Name                  | RonMeter                             |
      | MRID                  | 5db4c217-df3f-45af-8538-25fdc7a1a4d0 |
      | Device type           | Mx372 Test Devicetype                |
      | Serial number         | 987654                               |
      | Year of certification | 2018                                 |

    #Then I verify  if "Name" has the value "RonMeter"
    #And I verify  if "MRID" has the value "5db4c217-df3f-45af-8538-25fdc7a1a4d0"
    #And I verify  if "Device type" has the value "Mx372 Test Devicetype"
    #And I verify  if "Serial number" has the value "987654"
    #And I verify  if "Year of certification" has the value "2019"

    When I want to change the information i click on Edit "'SIM'" under the "Actions" button
    Then I Change the Values from old value to new value
      |Object   | value           |
      |Status   |Active           |
      |ICCID    |55555555799      |
      |Provider |Telfort          |
      |Format   |Mini-SIM (2FF)   |
      |Batch ID |122288882        |
      |IMSI     |2288888880       |
    And I want i click on the "Save" button

    #Then I should see the "Edit SIM" overview page
    #And I change the SIM "Status" in the dropdown from "Created" to "Active"
    #And I change the SIM "ICCID" in the textfield from "555555557752" to "55555555799"
    #And I change the SIM "Provider" in the textfield from "KPN" to "Telfort"
    #And I change the SIM "Format" in the dropdown from "Full-size (1FF)" to "Mini-SIM (2FF)"
    #And I change the SIM "Batch ID" in the dropdown from "122288882" to "ç"
    #And I change the SIM "IMSI" in the dropdown from "8888888880" to "2288888880"

    When I  see my "Device attributes" overview page
    Then I verify if the atttributes has the correct values
      |Object|Attribute|value            |
      |SIM   |Status   |Active           |
      |SIM   |ICCID    |55555555799      |
      |SIM   |Provider |Telfort          |
      |SIM   |Format   |Mini-SIM (2FF)   |
      |SIM   |Batch ID |122288882        |
      |SIM   |IMSI     |2288888880       |
    #And I verify the "SIM" details and the "Status" should be "Active"
    #And I verify the "SIM" details and the "ICCID" should be "55555555799"
    #And I verify the "SIM" details and the "Provider" should be "Telfort"
    #And I verify the "SIM" details and the "Format" should be "Full-size (1FF)"
    #And I verify the "SIM" details and the "Batch ID" should be "122288999"
    #And I verify the "SIM" details and the "IMSI" should be "2288888880"
