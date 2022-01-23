Feature: Testinium Challenge

  Background:
    Given user navigates to trendyol web site
    And user closes popup
    Given user clicks sign in button
    Then user is on login page
    When user enters "baturtestmaili@gmail.com" and "12345asdfgASDFG"
    And user clicks login button
    Then login success

  Scenario: Basket Test
    Given user searches for "computer"
    And user selects random product
    Then selected product info is written in to a file
    And user add product to basket
    Then product price and basket price are compared
    And user increases the product number
    Then it is checked that product number is "2"
    And user deletes product from basket
    Then basket is empty


