Feature: Log Out Functionality

  Scenario: Validate logging out and browsing back - TC_LG_004
    Given Login
    When Logout
    And Click Browser back button
    Then User should be logged out