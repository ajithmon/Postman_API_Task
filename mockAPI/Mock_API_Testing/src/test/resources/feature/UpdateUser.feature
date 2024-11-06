Feature: Validate Update User End Point

  Scenario: Verify user can Update booking
    Given user wants to call "api/users/@id" end point
    And set header "Content-Type" to "application/json"
    And set request body from file "update.json"
    When user performs put call
    Then verify status code is 200
