Feature: Open Cart Functionalities

  Scenario: TC_PC_010 Validate displaying the message: You have not chosen any products to compare. on the page
    Given Navigate to web site
    When Hover the mouse on Desktops and select Show All Desktops option
    And  Click on Product compare link
    Then User should be see You have not chosen any products to compare message on the page
