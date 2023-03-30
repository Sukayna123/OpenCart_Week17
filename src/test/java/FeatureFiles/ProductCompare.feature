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

    Scenario: TC_PC_005 Validate adding the product for comparison from Grid View of Product Category or Sub Category page
      Given Navigate to web site
      When Hover the mouse on Desktops and select Show All Desktops option --- --- aa bbss  dsdas
      And Select Grid view
      And Hover the mouse cursor on Compare this Product option from the displayed Product Display Page
      Then Tool tip with the text Compare this Product should be displayed
      And Click Compare this Product option
      Then Success message with text Success: You have added Product Name to your product comparison! should be displayed
      And Click on product comparison link from the displayed success message
      Then User should be taken to the Product Comparison page with the details of the Product that we have added for comparison.

  Scenario: TC_PC_010 Validate displaying the message: You have not chosen any products to compare. on the page
    Given Navigate to web site
    When Hover the mouse on Desktops and select Show All Desktops option
    And  Click on Product compare link
    Then User should be see You have not chosen any products to compare message on the page

