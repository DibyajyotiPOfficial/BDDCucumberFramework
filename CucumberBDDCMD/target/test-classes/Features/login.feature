Feature: Validate login functonality

  Scenario: Check login with valid credentials
    Given user is on login page1
    When user enters valid username and password
    And Clicks on login button
    Then user is navigated to the home page

  Scenario: Check login with invalid credentials
    Given user is on login page
    When user enters invalid username and password
    And hits the submit button
    Then error message is displayed - Invalid credentials
