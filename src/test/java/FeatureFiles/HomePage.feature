Feature: Home Page Functionality

  Scenario Outline: TC_HP_001 Validate navigating to Home Page from Shopping Cart page
    Given Navigate to web site
    When Enter any existing Product name into the Search text box field "<Product>"
    And Click on the button having search icon
    And Click on Add to Cart button on the Product displayed in the Search results
    And Click on the Shopping cart! link in the displayed success message
    And Click on Continue Shopping button in the Shopping Cart Page
    Then User should be taken to Home Page

    Examples:
      | Product |
      | iMac    |