Feature: Log Out Functionality

  Scenario: TC_LG_004 - Validate logging out and browsing back
    Given Login
    When Logout
    And Click Browser back button
    Then User should be logged out

  Scenario: TC_LG_010 -
    Given Login
    When Logout
    Then User should be see Account Logout Page


  Scenario: TC_LG_009 - Proper Page Heading, Page Title, Page URL and Breadcrumb are displayed for 'Account Logout' page.
    Given I am logged in to my account
    When I click on the "My Account" dropdown menu
    And I select the "Logout" option
    And I check "Proper Page Heading" "Page Title" "Breadcrumb" "Page URL"
    Then I should be redirected to the "Account Logout" page