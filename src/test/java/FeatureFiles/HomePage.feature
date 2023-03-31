Feature: Home Page Functionality

  Scenario:  TC_HP_004 Validate navigating to Home page from any Category Page which dont have any products
    Given I am on the home page of the website
    When I hover the mouse on the Desktops menu
    And I select the PC zero option
    And I click on the Continue button in the PC Category page having zero products displayed
    Then I should be redirected to Homepage