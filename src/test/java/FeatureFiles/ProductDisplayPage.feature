Feature: Product Display Page Functionality


  Scenario: TC_PDP_030 Validate navigating to the Product Display page by using the Product Name link in the 'Cart' button toggle box
    Given Navigate to web site
    When  Entering  any existing "<Product>" name into the Search text box field
    And Click on the button having search icon
    And  Click on Add to Cart option on the product that is displayed in the Search Results
    And Click on Cart button which is in black color beside the search icon button on the top of the page
    Then  Click on the Product Name link in the displayed toggle box
    Example:
      Product|
      | iMac|