Feature: Search Functionality
  Scenario Outline: TC_SF_005 Validate searching by providing a search criteria which results in multiple products
    Given Navigate to Application
    When Enter any existing Product name into the Search text box field "<Product>"
    And Click on the button having search icon
    Then More than one products should be displayed in the search results page
    Examples:
      | Product |
      | Mac     |
