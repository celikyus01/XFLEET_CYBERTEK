@db
Feature:Clicking Create Vehicle Odometer as a Truck Driver

  Background:
    Given the user is on the login page
    When the user enters the driver information

  @XFLEET-177 @US19-TC1  @US19-TC2
  Scenario: Truck Driver clicks vehicle Odometer
    When the user clicks "Vehicle Odometer" under the "Fleet"
    Then "Vehicles Odometers" subtitle should be displayed
    When the user clicks  button Create Vehicle Odometer
    Then Verify that "Create Vehicle Odometer" displayed