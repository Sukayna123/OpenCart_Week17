Feature: Shopping Cart Functionality


  Scenario: TC_SC_012 - Validate Breadcrumb of 'Shopping Cart' page
    Given I am on the home page
    When I enter an existing product name into the search text box
    And I click on the search button
    And I click on the product name in the search results
    And I click on the "Add to Cart" button
    And I click on the "shopping cart!" link in the success message
    And the breadcrumb should display "Home > Shopping Cart"
    Then I click the breadcrumb

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

  Scenario Outline: TC_SC_018 Validate Closing the Warning message in the 'Shopping Cart' page
    Given Navigate to Application
    When Enter any existing Product name into the Search text box field "<Product>"
    And Click on the button having search icon
    And Click on the Product displayed in the Search results
    And Click on Add to Cart button in the displayed Product Display page
    And Click on the Shopping cart! link in the displayed success message
    And Click on Use Coupon Code section
    When Don't enter any Coupon code into the Enter your coupon here text field
    And Click on Apply Coupon button
    And Click on x option on the displayed warning message
    Then Warning message should disappear.
    Examples:
      | Product |
      | iMac    |

