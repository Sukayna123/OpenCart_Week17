Feature: nebahat
  Scenario: TC_FP_004 Validate logging into the Application with the old password when you have initiated the resetting password process and have not reset the password
    Given Navigate to the Login page
    When I click on Forgotten Password link from Login page
    And Enter registered email address into the E-mail Address field
    And Click on Continue button
    And Enter with old credentials
    And Click on Login button after forgot password
    Then User should be logged in

  Scenario Outline: TC_SF_005 Validate searching by providing a search criteria which results in multiple products
    Given Navigate to Application
    When Enter any existing Product name into the Search text box field "<Product>"
    And Click on the button having search icon
    Then More than one products should be displayed in the search results page
    Examples:
      | Product |
      | Mac     |

  Scenario Outline: TC_PC_001 Validate adding the product for comparison from Product Display Page
    Given Navigate to Application
    When Enter any existing Product name into the Search text box field "<Product>"
    And Click on the button having search icon
    When Hover the mouse cursor on Compare this Product option from the displayed Product Display Page
    Then Tool tip with the text Compare this Product should be displayed
    When Click Compare this Product option
    Then Success message with text Success: You have added Product Name to your product comparison! should be displayed
    And Click on product comparison link from the displayed success message
    Then User should be taken to the Product Comparison page with the details of the Product that we have added for comparison.
    Examples:
      | Product |
      | iMac    |

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

  Scenario: TC_WL_008 Validate navigating to 'My Wish List' page using the 'Right Column' header options
    Given Navigate to Application
    And Login
    And  Click on Wish List option from the Right Column options
    Then User should be taken to My Wish List page

  Scenario Outline: TC_CO_017 Validate Checkout as New User
    Given Navigate to Application
    When Enter any existing Product name into the Search text box field "<Product>"
    And Click on the button having search icon
    And Click on Add to Cart button on the Product displayed in the Search results
    And Click on the Shopping cart! link in the displayed success message
    When Click on Checkout button in the Shopping Cart page
    Then Checkout Page should be displayed
    And Select Register Account option in the New Customer section of the displayed Checkout page
    When Click on Continue button in CheckoutOptions
    Then User should be taken to Billing Details section
    And My delivery and billing addresses are the same checkbox should be displayed as selected by default
    And Enter details into all the fields
    When Click on Continue button in BillingDetails
    And Click on Continue button in Delivery Details
    Then User should be taken to Delivery Method section
    And Flat Shipping Rate 5dollar radio button should be displayed as selected by default
    When Click on Continue button in Delivery Method
    Then User should be taken to Payment Method section
    And Bank Transfer radio button should be displayed as selected by default
    When Select Terms and Conditions checkbox
    And Click on Continue button in Payment Method
    Then User should be taken to Confirm Order section
    And Correct and Proper details should be displayed in the Confirm Order section
    When Click on Confirm Order button in Confirm Order
    Then Order should be placed and User should be taken to Success page (Proper details should be displayed in the Order Success page)
    Examples:
      | Product |
      | iMac    |

  Scenario Outline: TC_CO_018 As a user I should be able to check out, when I add an item to Cart with out sign in and sign from check out section.
    Given Navigate to Application
    When Enter any existing Product name into the Search text box field "<Product>"
    And Click on the button having search icon
    And Click on Add to Cart button on the Product displayed in the Search results
    And Click on the Shopping cart! link in the displayed success message
    And Click on Checkout button in the Shopping Cart page
    Then Checkout Page should be displayed
    And Enter credentials of existing account in the Returning Customer section of the displayed Checkout page
    And Click on Login button
    Then User should be logged in and taken to Billing Details section
    And  I want to use an existing address checkbox should be displayed as selected by default
    When Click on Continue button in BillingDetails after Login
    And I want to use an existing address radio button should be displayed as selected by default
    When Click on Continue button in Delivery Details
    Then User should be taken to Delivery Method section
    And Flat Shipping Rate 5dollar radio button should be displayed as selected by default
    When Click on Continue button in Delivery Method
    Then  User should be taken to Payment Method section
    And Select Terms and Conditions checkbox
    When Click on Continue button in Payment Method
    Then User should be taken to Confirm Order section
    When Click on Confirm Order button in Confirm Order
    Then Order should be placed and User should be taken to Success page (Proper details should be displayed in the Order Success page)
    Examples:
      | Product |
      | iMac    |
