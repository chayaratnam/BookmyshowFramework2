Feature: BookMyShow Login

  Scenario: Login with valid mobile number and OTP
    Given user is on BookMyShow login page
    When user enters valid mobile number "<valid_mobile>"
    And user enters valid OTP "<valid_otp>"
    Then user should be logged in successfully

  Scenario: Login with invalid mobile number
    Given user is on BookMyShow login page
    When user enters invalid mobile number "<invalid_mobile>"
    Then error message should be displayed

  Scenario: Verify login UI elements
    Given user is on BookMyShow login page
    Then all login fields and buttons should be visible and functional