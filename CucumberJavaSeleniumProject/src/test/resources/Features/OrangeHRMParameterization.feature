Feature: OrangeHRM Login Functionality

  Scenario Outline: User should be able to login successfully with given data
    Given Browser launches and user is on the login page
    When User passes valid "<username>" and "<password>"
    And Clicks on login button
    Then The user is now logged in and sees the landing screen
    And Finally logs out from application

  Examples:
    | username | password  |
    | Admin    | admin123  |
    | Admin    | admin124  |
    | Admin    | admin125  |