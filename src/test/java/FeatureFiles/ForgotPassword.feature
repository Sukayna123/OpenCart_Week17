Feature: Forgot Password Functionality

  Scenario: TC_FP_021 Validate Breadcrumb of the 'Forgotten Password' page
    Given Navigate to web site
    When Click on My Account dropdown menu and click on login
    And Click on forgotten password link
    Then Breadcrumb are displayed
    Then Check the Breadcrumb links working
