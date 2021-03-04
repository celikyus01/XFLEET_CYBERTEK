
Feature:Reaching specific odometer info as a Truck Driver

  Background:
    Given the user is on the login page
    When the user enters the driver information

  @XFLEET-161 @US20-TC1  @US20-TC2
  Scenario: Truck Driver clicks vehicle Odometer
    When the user clicks "Vehicle Odometer" under the "Fleet"
    Then "Vehicles Odometers" subtitle should be displayed
    And the user clicks id "1"
    Then the users clicks "Vehicle Odometer" next to Driver name
    Then the user verifies "Vehicles Odometers" is dislayed