Feature: Validate Delete User End Point

  Scenario: Verify user can Delete booking
    Given user wants to call "api/users/@id" end point
    And set header "Content-Type" to "application/json"
    When user performs delete call
    Then verify status code is 204
