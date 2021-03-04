
Feature:Truck Driver can see all informations about specific car.


  Background:
    Given the user is on the login page
    When the user enters the driver information
    And  the user navigates to "Fleet" -- "Vehicles"


  @XFLEET-93 @US06-TC1  @US06-TC2
  Scenario: Clicking General button as a Truck Driver
    When the user selects vehicle log with id1
    Then the user seeing general information subtitle is displayed
    And  the user clicks General button
    Then General Information should be displayed
    And  the user clicks Activity Type button
    Then Activity Type should be displayed
