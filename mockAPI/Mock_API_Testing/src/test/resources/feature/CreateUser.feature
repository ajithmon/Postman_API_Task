Feature: Validate Create User End Point

  Scenario: Verify user can create booking
    Given user wants to call "api/users" end point
    And set header "Content-Type" to "application/json"
    And set request body from file "create.json"
    And set request body from file "create.json" with "job" value "Trainer"
    When user performs post call
    Then verify status code is 201
    And verify response body has a field "name" is "Ajith"


