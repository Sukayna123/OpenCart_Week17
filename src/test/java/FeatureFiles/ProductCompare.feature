Feature: Product Compare Functionality
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