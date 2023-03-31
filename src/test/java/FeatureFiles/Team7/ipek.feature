Feature: Open Cart functionalities

  Scenario Outline: TC_CO_013 Validate without entering any fields in the Delivery Details Section of the Checkout Page
    Given Navigate to web site
    When Login
    And Enter any existing Product name into the Search text box field "<Product>"
    And Click on the button having search icon
    And Click on Add to Cart button on the Product displayed in the Search results
    And Click on the Shopping cart! link in the displayed success message
    And Click on Checkout button in the Shopping Cart page
    And Click on Continue button in Billing Details
    And Select I want to use a new address radio option
    And Click on Continue button in Delivery Details
    Then Warning messages should be displayed for all mandatory fields in Delivery Details section


    Examples:
      | Product |
      | iMac    |

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

  Scenario: TC_LG_004 - Validate logging out and browsing back
    Given Login
    When Logout
    And Click Browser back button
    Then User should be logged out

  Scenario: TC_PC_005 Validate adding the product for comparison from Grid View of Product Category or Sub Category page
    Given Navigate to web site
    When Hover the mouse on Desktops and select Show All Desktops option
    And Select Grid view
    And Hover the mouse cursor on Compare this Product option from the displayed Product Display Page
    Then Tool tip with the text Compare this Product should be displayed
    And Click Compare this Product option
    Then Success message with text Success: You have added Product Name to your product comparison! should be displayed
    And Click on product comparison link from the displayed success message
    Then User should be taken to the Product Comparison page with the details of the Product that we have added for comparison.

  Scenario: TC_FP_021 Validate Breadcrumb of the 'Forgotten Password' page
    Given Navigate to web site
    When Click on My Account dropdown menu and click on login
    And Click on forgotten password link
    Then Breadcrumb are displayed
    Then Check the Breadcrumb links working

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

    Scenario: TC_WL_004 Validate adding the product to Wish List from the Products displayed in the category or sub-category page
      Given Login
      When Hover the mouse on Desktops and select Show All Desktops option
      And Select Mac subcategory option from the left side options
      And Click on Add to Wish List option
      Then Success message with text - Success: You have added Product Name to your wish list! should be displayed
      And Click on Wish List link in the success message
      Then Product should be successfully displayed in the My Wish List page


