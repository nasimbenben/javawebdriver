@run
Feature: Verify device CAS set SIM information

  Scenario: As a end user i want to change the SIM details for a device
    #Given user is logged in as user "Enexis_General" and password "DukeS01"
    Given user is logged in as user "Enexis_NasimBenbouchta" and password "SzrhapMkP9"
    When user sees "Dashboard" overview page
    Then user clicks on "Devices" under the "MultiSense" main menu
    When user sees "Devices" overview page
    Then user selects "Device group" under the "Device groups" object
    And user clicks on "Test Ruben" under Device groups
    And user selects "RonMeter" in a list overview
    And user clicks on "Device attributes" of the object menu
    When user sees "Device attributes" overview page
    Then user verifies if the objects has the correct values
      | Object                | Value                                |
      | Name                  | RonMeter                             |
      | MRID                  | 5db4c217-df3f-45af-8538-25fdc7a1a4d0 |
      | Device type           | Mx372 Test Devicetype                |
      | Serial number         | 987654                               |
      | Year of certification | 2018                                 |
    #Then user verifies if "Name" has the value "RonMeter"
    #And user verifies if "MRID" has the value "5db4c217-df3f-45af-8538-25fdc7a1a4d0"
    #And user verifies if "Device type" has the value "Mx372 Test Devicetype"
    #And user verifies if "Serial number" has the value "987654"
    #And user verifies if "Year of certification" has the value "2019"
    When user wants to change the information i click on Edit "SIM" under the "Actions" button
    Then user changes the Values from old value to new value
      |object   | value            |
      |Status   | Active           |
      |ICCID    | 55555555799      |
      |Provider | Telfort          |
      |Format   | Mini-SIM (2FF)   |
      |Batch    | 122288882        |
      |IMSI     | 2288888880       |
    And user clicks on the "Save" button
#Then user sees the "Edit SIM" overview page
#And user changes the SIM "Status" in the dropdown from "Created" to "Active"
#And user changes the SIM "ICCID" in the textfield from "555555557752" to "55555555799"
#And user changes the SIM "Provider" in the textfield from "KPN" to "Telfort"
#And user changes the SIM "Format" in the dropdown from "Full-size (1FF)" to "Mini-SIM (2FF)"
#And user changes the SIM "Batch ID" in the dropdown from "122288882" to "ç"
#And user changes the SIM "IMSI" in the dropdown from "8888888880" to "2288888880"
    When user sees "Device attributes" overview page
    Then user verifies if the below attributes has the correct values
      |object|attribute|value            |
      |SIM   |Status   |Active           |
      |SIM   |ICCID    |55555555799      |
      |SIM   |Provider |Telfort          |
      |SIM   |Format   |Mini-SIM (2FF)   |
      |SIM   |Batch ID |122288882        |
      |SIM   |IMSI     |2288888880       |
#And user verifies the "SIM" details and the "Status" should be "Active"
#And user verifies the "SIM" details and the "ICCID" should be "55555555799"
#And user verifies the "SIM" details and the "Provider" should be "Telfort"
