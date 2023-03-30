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