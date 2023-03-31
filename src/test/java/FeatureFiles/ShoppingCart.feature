Feature: Shopping Cart Functionality


  Scenario: TC_SC_012 - Validate Breadcrumb of 'Shopping Cart' page
    Given I am on the home page
    When I enter an existing product name into the search text box
    And I click on the search button
    And I click on the product name in the search results
    And I click on the Add to Cart button
    And I click on the shopping cart link in the success message
    And the breadcrumb should display Home to Shopping Cart
    Then I click the breadcrumb



