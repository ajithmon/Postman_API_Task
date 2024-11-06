Feature: Validate Get User List End Point

  Scenario: Verify user List can Get booking
    Given user wants to call "api/@id" end point
    And set header "Content-Type" to "application/json"
    When user performs get call
    Then verify status code is 200