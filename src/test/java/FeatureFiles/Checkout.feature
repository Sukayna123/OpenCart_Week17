Feature: Checkout Functionality
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

