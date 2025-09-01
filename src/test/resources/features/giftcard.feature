Feature: Gift Card Module

  Scenario: Check gift card balance with invalid voucher
    Given user is on BookMyShow home page
    When user navigates to Gift Card section
    And user clicks on Check Gift Card Balance icon
    Then user should see invalid voucher error message