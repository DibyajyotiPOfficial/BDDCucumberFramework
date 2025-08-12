@POM
Feature: OrangeHRM Login Verification via Page Object Model
  Ensure that users can log in successfully using valid credentials through the POM framework.

  Scenario Outline: Authenticate user with valid credentials using POM
    Given the user opens the OrangeHRM login page
    When the user enters username "<username>" and password "<password>" using POM
    And submits the login form

  Examples:
    | username | password |
    | Admin    | admin123 |