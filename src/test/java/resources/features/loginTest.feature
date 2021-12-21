Feature: Testinium Challenge

  Background:
    Given user navigates to trendyol web site
    And user closes popup

  Scenario: Success Login Scenario
    Given user clicks sign in button
    Then user is on login page
    When user enters "baturtestmaili@gmail.com" and "12345asdfgASDFG"
    And user clicks login button
    When user is on main page
    Then login success

  Scenario: Failed Login Scenario
    Given user clicks sign in button
    Then user is on login page
    When user enters "test" and "test"
    And user clicks login button
    Then login fail error need to be displayed as "Lütfen geçerli bir e-posta adresi giriniz."
