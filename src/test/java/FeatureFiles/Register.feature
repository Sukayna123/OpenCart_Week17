Feature: Register Functionality

  Scenario: Register To OpenCart
    Given Navigate to web site
    When Click on My Account dropdown menu
    And Click on Register
    And Fill the fields, first name, last name, email, telephone, password, confirm password, privacy policy
      | Techno            |
      | Study             |
      | technoS@gmail.com |
      | 123412345         |
      | batch07           |
      | batch07           |
    And Click on Continue button
    And Click on Continue button of Account Success page