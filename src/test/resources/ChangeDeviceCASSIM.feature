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
    When user sees "Device attributes" overview page
    Then user verifies if the below attributes has the correct values
      |object|attribute|value            |
      |SIM   |Status   |Active           |
      |SIM   |ICCID    |55555555799      |
      |SIM   |Provider |Telfort          |
      |SIM   |Format   |Mini-SIM (2FF)   |
      |SIM   |Batch ID |122288882        |
      |SIM   |IMSI     |2288888880       |




