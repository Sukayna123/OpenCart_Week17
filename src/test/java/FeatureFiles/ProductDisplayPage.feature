Feature: Product Display Page Functionality


  Scenario: TC_PDP_018 Validate the review text given while writing is accepted according to the specified number of characters
    Given I am on the home page
    When I enter an existing product name into the search text box
    And I click on the search button
    And I click on the product name in the search results
    And I click on the Reviews tab
    And I provide my name and a rating for the product
    Then I should see a warning message that the review text must be between twenty five and one hundred characters

  Scenario: TC_PDP_033 Validate the prices of the Product when purchased in bulk
    Given I am on the home page
    When I enter an existing product name into the search text box
    And I click on the search button
    And I should see product of search results
    Then I should see the bulk purchase prices for the product

  Scenario Outline: TC_PDP_022 Validate Related Products section in Product Display page
    Given Navigate to Application
    When Enter any existing Product name into the Search text box field "<Product>"
    And  Click on the button having search icon
    And Click on the Product displayed in the Search results
    And Click on the Related Products section in the displayed Product Display Page
    Then User should see the Product displayed in the Related Products section and is able ot click it and navigate to the Product Display Page of it

    Examples:
      | Product |
      | iMac    |


