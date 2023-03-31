Feature: mix

  Scenario: TC_PC_004 Validate adding the product for comparison from List View of Product Category or Sub Category page
    Given Navigate to web site
    When Hover the mouse on any Menu say Desktops and select Show All Desktops option
    And In the displayed Desktops category page, select List View option
    And Hover the mouse cursor on Compare this Product option available on the Product that is displayed in the Product Category page
    And Select Compare this Product option
    Then click on product comparison link from the displayed success message


 Scenario Outline: TC_PDP_002 Validate that Product Name, Brand and Product Code are displayed in the Product Display Page
    Given Navigate to web site
    When Enter any existing "<Product>" into the Search box
    And  Click on the button having search icon
    And  Click on the Product displayed in the Search results
    Then Check the Product Name, Brand and Product Code in the displayed Product Display Page
    Examples:
     | Product|
      |iMac|
