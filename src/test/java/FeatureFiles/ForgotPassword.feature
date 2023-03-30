Feature: Forgot Password Functionality

  Scenario: TC_FP_004 Validate logging into the Application with the old password when you have initiated the resetting password process and have not reset the password
    Given Navigate to the Login page
    When I click on Forgotten Password link from Login page
    And Enter registered email address into the E-mail Address field
    And Click on Continue button
    And Enter with old credentials
    And Click on Login button after forgot password
    Then User should be logged in


  Scenario: TC_FP_021 Validate Breadcrumb of the 'Forgotten Password' page
    Given Navigate to web site
    When Click on My Account dropdown menu and click on login
    And Click on forgotten password link
    Then Breadcrumb are displayed
    Then Check the Breadcrumb links working

  Scenario: TC_FP_020 Validate navigating to 'Forgotten Password' page from 'Right Column' options
    Given Navigate to web site
    When click my account
    And click login
    And Click on Forgotten Password option from the Right Column
