Feature: Wish List Functionality


  Scenario: TC_WL_006 Validate navigating to 'My Wish List' page using the 'wish list!' link in the success messageValidate navigating to 'My Wish List' page using the 'wish list!' link in the success message
    Given I am on the home page
    When I enter an existing product name into the search text box
    And I click on the search button
    And I click on the product name in the search results
    And I click on the Add to Wish List button
    Then I should see success message

