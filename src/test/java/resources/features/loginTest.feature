Feature: Testinium Challenge

  Background:
    Given user navigates to trendyol web site
    And user closes popup

  Scenario: Login Scenario
    Given user clicks sign in button
    Then user is on login page
    When user enters "baturtestmaili@gmail.com" and "12345asdfgASDFG"
    And user clicks login button
    Then user is on main page

