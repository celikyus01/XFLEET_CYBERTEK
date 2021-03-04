@editCar
Feature: Editing Car

  Scenario Outline: Salesmanager and Store manager edits car
    Given the user is on the login page
    When the user logs in using "<username>" and "<password>"
    And the user navigates to "Fleet" -- "Vehicles"
    And the user selects car with licence number "<licenceNumber>"
    And the user clicks on "Edit Car" button
    When the user fills in the blank as "<newDriverName>" and "<newLocation>"
    And the user clicks on "Save" button
    Then the user verifies the message "Entity saved"
    And the user navigates to "Fleet" -- "Vehicles"
    Then the user verifies the data as "<newDriverName>" and "<newLocation>" for the licence number "<licenceNumber>"


    Examples:
      | username       | password    | licenceNumber | newDriverName | newLocation |
      | storemanager85 | UserUser123 | 1234          | Emil          | London      |
      | salesmanager61 | UserUser123 | 55-55         | Mustafa       | Ankara      |