Feature: City Search on BookMyShow

  Scenario: Search city with valid name
    Given user is on BookMyShow home page
    When user enters city "<city_name>"
    Then city results should display "<city_name>"

  Scenario: Search city with invalid name
    Given user is on BookMyShow home page
    When user enters city "<invalid_city>"
    Then error message should display

  Scenario: Select city by icon
    Given user is on BookMyShow home page
    When user clicks on city icon "<city_icon>"
    Then city results should display "<city_name>"

  Scenario: View all cities and verify
    Given user is on BookMyShow home page
    When user clicks on "View All Cities"
    Then verify few cities not shown in popular list