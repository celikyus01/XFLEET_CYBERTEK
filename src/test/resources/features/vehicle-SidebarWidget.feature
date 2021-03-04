Feature:Truck Driver should be able to use sidebar widget


  Background:
    Given the user is on the login page
    When the user enters the driver information
    And the user clicks plus sign

  @XFLEET-45 @US5-TC1
  Scenario:Truck Driver clicks recent emails
    Then Sidebar Widgets should displayed
    And the user clicks on "1" recent emails add button
    Then added  "1" should be displayed

  @XFLEET-47 @US5-TC2
  Scenario:US5-TC2 Adding Sticky notes  as a Tuck Driver
    Then Sidebar Widgets should displayed
    And the user clicks on "2" recent emails add button
    Then added  "2" should be displayed
