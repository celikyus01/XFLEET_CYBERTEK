@wipAndy
Feature: Truck driver using Widgets, Pin and Favorite options

  Background:
    #@XFLEET-258
    Given the user is on the login page
    When the user enters the driver information
    And the user navigates to "Fleet" -- "Vehicle Costs"

  @XFLEET-252
  Scenario: US27-TC1 Add Recent Email widget as a Truck Driver
    Given the user clicks plus sign
    When the user clicks on Sidebar Widgets Add button number '1'
    And the user clicks Sidebar Widgets Close button
    Then the created "Recent Emails" widget should be visible

  @XFLEET-253
  Scenario: US27-TC2 Add Sticky Note widget as a Truck Driver
    Given the user clicks plus sign
    When the user clicks on Sidebar Widgets Add button number '2'
    And the user clicks Sidebar Widgets Close button
    Then the created "Sticky Note" widget should be visible

  @XFLEET-254
  Scenario: US27-TC3 Add Assigned Tasks widget as a Truck Driver
    Given the user clicks plus sign
    When the user clicks on Sidebar Widgets Add button number '3'
    And the user clicks Sidebar Widgets Close button
    Then the created "Assigned Tasks" widget should be visible

  @XFLEET-255
  Scenario: US27-TC4 Pin the page as a Truck Driver
    Given the current state of "Pin" sign
    When the user clicks the "Pin" sign
    Then the "Pin" sign should change color (gray-gold)
    And the pinned page visibility should change

  @XFLEET-256
  Scenario: US27-TC5 Make the page favourite as a Truck Driver
    Given the current state of "Favorite" sign
    When the user clicks the "Favorite" sign
    Then the "Favorite" sign should change color (gray-gold)
    When the user clicks on dropdown menu of header
    And selects "Favorites" in the popup menu
    Then the favorite page title should swap state in the popup menu (invisible-visible)

