
@XFLEET-231
Feature: Sales manager should be able to creat car using Create Car Button

  Background:
    Given the user is on the login page
    When the user enters the sales manager information
    Given the user clicks "Vehicles" under the "Fleet"
    When the user clicks Create Car button
    And the user enters car informations
      | License Plate               | 42-46       |
      | Tags 	                    | Purchased   |
      | Driver 	                    | Mustafa     |
      | Location 	                | London      |
      | Chassis Number	            | 12345       |
      | Model Year                  | 2021        |
      | Last Odometer 	            | 2021        |
      | Immatriculation Date        | CurrentDate |
      | First Contract Date         | CurrentDate |
      | Catalog Value (VAT Incl.)   | $2,200.00   |
      | Seats Number                | 2           |
      | Doors Number 	            | 2           |
      | Color                       | Blue        |
      | Transmission 	            | Automatic   |
      | Fuel Type                   | Electric    |
      | CO2 Emissions 	            | 22          |
      | Horsepower                  | 122         |
      | Horsepower Taxation         | 2000        |
      | Power (KW)                  | 200         |
      | Vehicle Model	            | Rouge       |
      | Vehicle Make                | Tesla       |


  Scenario: Scenario: Save And Close -- Creating car using Create Car Button
    Then the user clicks Save And Close button
    And the user should be able to verify Entity saved


  Scenario: Scenario: Save And Close -- Creating car using Create Car Button
    Then the user clicks Save And New button
    And the user should be able to verify Entity saved


  Scenario: Scenario: Save -- Creating car using Create Car Button
    Then the user clicks Save button
    And the user should be able to verify Entity saved
