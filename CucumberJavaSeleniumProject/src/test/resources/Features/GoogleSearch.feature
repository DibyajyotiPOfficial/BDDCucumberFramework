Feature: to test google search functionality

Scenario: google search is working.

Given browser is open and maximized
When user enters anything in search box 
And hits enter
Then user should be navigated to the respective page