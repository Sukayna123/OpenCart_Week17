Feature: Product Compare Functionality


    Scenario: TC_PC_009 Validate navigating to Product Compare page from Product Category page
      Given I am on the home page
      When I hover the mouse over the Desktops menu
      And I select the Show All Desktops option
      And I should see a list of desktop products
      Then I click on the Product Compare link for two products