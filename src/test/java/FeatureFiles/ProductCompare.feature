Feature: Product Compare Functionality


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


  Scenario: TC_PC_004 Validate adding the product for comparison from List View of Product Category or Sub Category page
    Given Navigate to web site
    When Hover the mouse on any Menu say Desktops and select Show All Desktops option
    And In the displayed Desktops category page, select List View option
    And Hover the mouse cursor on Compare this Product option available on the Product that is displayed in the Product Category page
    And Select Compare this Product option
    Then click on product comparison link from the displayed success message