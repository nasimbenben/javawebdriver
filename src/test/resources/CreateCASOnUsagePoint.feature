@run
Feature: Create CAS on usage point

  Scenario: As a user I want to add a CAS on a usage point
    Given user is logged in as user "Enexis_TomWiggers" and password "pBZbuPnJTD"
    When user sees "Dashboard" overview page
    Then user clicks on "Usage points" under the "Insight" main menu
    When user sees "Usage points" overview page
    Then user selects "Usage point lifecycle management" under the "Add usage point" object
    When user sees "Step 1: General information" overview page
    And user changes the Values from old value to new value
      | object              | value        |
      | Name                | TestTomNasim |
      | Service category    | Electricity  |
      | Type of usage point | Physical SDP |
    And user clicks on "Next"
    When user sees "Step 2: Technical information" overview page
    And user clicks on "Next"
    When user sees "Step 3: General" overview page
    And user changes the Values from old value to new value
      | object                        | value                |
      | Grid operator                 | 8716916000004 Coteq  |
      | Administrative status         | SMU                  |
      | External Grid Operator Master | 8712423014022 Enexis |
    And user clicks on "Next"
    When user sees "Step 4: Link metrology configuration" overview page
    And user clicks on "Next"
    When user sees "Step 5: Calendars" overview page
    And user clicks on "Next"
    When user sees "Step 6: Life cycle transition" overview page
    And user changes the Values from old value to new value
      | object           | value            |
      | Transition       | Install inactive |
      | Connection state | Connected        |
    And user clicks on "Add"





