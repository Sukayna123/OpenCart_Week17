Feature: Forgot Password Functionality
  Scenario: TC_FP_004 Validate logging into the Application with the old password when you have initiated the resetting password process and have not reset the password
    Given Navigate to the Login page
    When I click on Forgotten Password link from Login page
    And Enter registered email address into the E-mail Address field
    And Click on Continue button
    And Enter with old credentials
    And Click on Login button after forgot password
    Then User should be logged in