Feature: Check homepage functionality

  Background: User is logged in
    Given user is on the login page
    When user enters the username and password
    And hits the login button
    Then user is navigated to the dashboard page

  Scenario: Check logout link
    When User clicks on welcome link
    Then Logout link is displayed

  Scenario: Verigy quick launch tool bar is present
    When user lands on the dashboard page
    Then Quick launch toolbar is displayed
