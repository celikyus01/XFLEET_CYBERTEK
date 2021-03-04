

Feature:  Truck Driver should be able to use Grid Settings



  Background:
    Given the user is on the login page
    When the user enters the driver information
  @XFLEET-61 @US4-TC1 @US-TC2
  Scenario:  Truck Driver uses Grid Settings
    When the user clicks "Vehicles" under the "Fleet"
    Then the url should be changed
    And the user clicks Grid Settings button
    Then Grid Setting should be displayed
    And the user clicks Quick Search -- "Id"
    Then "Id" should be selected