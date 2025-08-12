@SmokeScenario
Feature: Classic Login Functionality Test
  Validate login using direct locators and basic flow.

  @SmokeTest
  Scenario: Verify login with valid credentials using classic flow
    Given the user is on the login page
    When the user enters valid username and password
    And clicks the login button
    Then the user should be navigated to the home page