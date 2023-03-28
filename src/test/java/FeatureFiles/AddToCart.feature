Feature: Add To Cart Functionality
  Scenario Outline: TC_ATC_003 Validate adding the product to Cart from Search Results Page
    Given Navigate to Application
    When Enter any existing Product name into the Search text box field as  "<Product>"
    And Click on the button having search icon
    And Click on Add to Cart option on the product that is displayed in the Search Results
    Then Success message with text - Success: You have added Product Name to your shopping cart! should be displayed
    And Click on Cart button which is in black color beside the search icon button on the top of the page
    And Click on View Cart option in the displayed box
    Then Product should be successfully displayed in the Shopping Cart page a "<Product>"
    Examples:
      | Product |
      | iMac    |
