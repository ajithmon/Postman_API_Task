Feature: Validate Get User End Point

  Scenario: Verify user can Get booking
    Given user wants to call "api/users/@id" end point
    And set header "Content-Type" to "application/json"
    When user performs get call
    Then verify status code is 404


