Scenario: As an end user i want to add unaccepted the SIM details for a device and verify if they are not saved.
Given user is logged in as user "Enexis_NasimBenbouchta" and password "SzrhapMkP9"
When user sees "Dashboard" overview page
Then user clicks on "Devices" under the "MultiSense" main menu
When user sees "Devices" overview page
Then user selects "Device group" under the "Device groups" object
And user clicks on "Test Ruben" under Device groups
And user selects "TestDeviceTom" in a list overview
And user clicks on "Device attributes" of the object menu
When user sees "Device attributes" overview page
And user selects "Versions" in a list overview
Then user clicks on "Add version" button
When user sees "Add 'SIM' version" overview page
Then user changes the Values from old value to new value
|object   | value         |
|Status   | SuperAaan     |
|ICCID    |               |
|Provider |               |
|Format   | Simloos)      |
|Batch    | vijfvierdrie  |
|IMSI     | tweeacht      |
And user clicks on the "Save" button
When user sees "Edit 'Infinite'" overview page
Then user sees the message under "ICCID" the error message "This field is required"
Then user sees the message under "Provider" the error message "This field is required"
Then user changes the Values from old value to new value
|object   | value            |
|Status   | Active           |
|ICCID    |55555555799       |
|Provider  |BosscheBol Telecom|
And user clicks on the "Save" button
And user clicks on "Device attributes" of the object menu
When user sees "Device attributes" overview page
Then user verifies if the below attributes has not the incorrect values
|object|attribute|value                 |
|SIM   |Status   |SuperAaan             |
|SIM   |ICCID    |vijfnegen             |
|SIM   |Format   |Simloos)              |
|SIM   |Batch ID |vijfvierdrie          |
|SIM   |IMSI     |tweeacht              |