Feature: Checkout Functionality

  Scenario: Validate adding comments about your order in the Delivery Method section of Checkout page
    Given I am on the home page of the website
    When I enter Product Name into the search text box field
    And I click on the search icon
    And I click on the Add to Cart button on the Product displayed in the Search results
    And I click on the shopping cart link in the displayed success message
    And I click on the Checkout button in the Shopping Cart page
    And I click on the Continue button
    And I click on the Continue button
    And I enter Order Comments into the Add Comments About Your Order text field
    And I click on the other Continue button
    And I select the Terms and Conditions checkbox field
    And I click on the other one Continue button
    And I click on the Confirm Order button
    Then I should see a success message



