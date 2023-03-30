Feature: Log Out Functionality

  Scenario: TC_LG_004 - Validate logging out and browsing back
    Given Login
    When Logout
    And Click Browser back button
    Then User should be logged out