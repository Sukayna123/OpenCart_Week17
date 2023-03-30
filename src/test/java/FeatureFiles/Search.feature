Feature: Search Functionality
  Scenario Outline: TC_SF_005 Validate searching by providing a search criteria which results in multiple products
    Given Navigate to Application
    When Enter any existing Product name into the Search text box field "<Product>"
    And Click on the button having search icon
    Then More than one products should be displayed in the search results page
    Examples:
      | Product |
      | Mac     |

  Scenario Outline: TC_SF_001  Validate displaying the searched product in the search results
    Given Navigate to Application
    When Enter any existing Product name into the Search text box field "<Product>"
    And Click on the button having search icon
    Then  Searched product should be displayed in the search results
    Examples:
    | Product |
    | iMac    |

  Scenario Outline: TC_SF_015 Validate displaying the selected number of products in the current search page
    Given Navigate to Application
    When Enter any existing Product name into the Search text box field "<Product>"
    And  Click on the button having search icon
    Then The selected number of products should be displayed in the current search page
    Examples:
      | Product |
      | Mac     |
