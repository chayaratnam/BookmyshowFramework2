Feature: Movie Search on BookMyShow

  Scenario: Search a currently running movie
    Given user is on BookMyShow home page
    When user searches movie "<movie_name>"
    Then movie results should display "<movie_name>"

  Scenario: Validate Movies tab UI
    Given user is on BookMyShow home page
    When user clicks on Movies tab
    Then movies screen UI should be visible

  Scenario: Explore upcoming movies
    Given user is on Movies screen
    When user clicks on "Explore Upcoming Movies"
    Then upcoming movies section should be visible

  Scenario: Validate "Cinemas Near You" link
    Given user is on Movies screen
    Then "Cinemas Near You" link should be visible