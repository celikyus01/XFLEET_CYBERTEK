
@XFLEET-231
Feature: SalesManager should be able to see general information about car, when clicked on any car in the grid

  Background:
    Given the user is on the login page
    When the user enters the sales manager information
    And the user clicks "Vehicles" under the "Fleet"


  Scenario: seeing all information about selected car
    When the user clicks on first car in the grid
    Then the user should be able to see all information about selected car


  Scenario: filtering activities by using either Activity Type button or Date Range button
    Then the user clicks on first car in the grid
    Then the user clicks call under the Activity Type button
    Then the user should be able to verify filtering


  Scenario: refreshing activities by using refresh button
    Then the user clicks Refresh button
    Then the user should be able to see the refreshing message