Feature: Shopping Cart Functionality

  Scenario Outline: TC_SC_010 Validate removing the item from Shopping Cart page
    Given Navigate to web site
    When Enter any existing Product name into the Search text box field "<Product>"
    And Click on the button having search icon
    And Click on the Product displayed in the Search results
    And Click on Add to Cart button displayed Product Display page
    And Click on the Shopping cart! link in the displayed success message
    And Click on the Remove icon option
    Then Product should be removed from the Shopping Cart page

    Examples:
      | Product |
      | iMac    |
