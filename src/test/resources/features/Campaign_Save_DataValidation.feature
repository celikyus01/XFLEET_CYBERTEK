@XFLEET-247
Feature: Campaign Save _ Data Validation

  @XFLEET-248 @XFLEET-246
  Scenario: US43-TC1 Name field accept valid data (positive scenario)
    Given the user is on the login page
    When the user logs in using "storemanager52" and "UserUser123"
    And the user navigates to "Marketing" -- "Campaigns"
    When the user clicks on "Create Campaign" button
    And "Create Campaign" subtitle should be displayed
    And the user sent keys to "Name" field as "IBM"
    When the user clicks on "Save" button
    Then there should be NO message under "Name" field


  @XFLEET-249 @XFLEET-246
  Scenario: Budged field accept valid data(positive scenario)
    Given the user is on the login page
    When the user logs in using "storemanager52" and "UserUser123"
    And the user navigates to "Marketing" -- "Campaigns"
    When the user clicks on "Create Campaign" button
    And "Create Campaign" subtitle should be displayed
    And the user sent keys to "Budged" field as "123"
    When the user clicks on "Save" button
    Then there should be NO message under "Name" field


  @XFLEET-250 @XFLEET-246
  Scenario Outline: Code field accepts valid data (positive scenario)
    Given the user is on the login page
    When the user logs in using "storemanager52" and "UserUser123"
    And the user navigates to "Marketing" -- "Campaigns"
    When the user clicks on "Create Campaign" button
    And "Create Campaign" subtitle should be displayed
    And the user sent keys to "Code" field as "<value>"
    When the user clicks on "Save" button
    Then there should be NO message under <Code> field
    Examples:
      | value  |
      | 123    |
      | abc    |
      | abc123 |


  @XFLEET-251 @XFLEET-246
  Scenario Outline: Name field accept invalid data (negative scenario)
    Given the user is on the login page
    When the user logs in using "storemanager52" and "UserUser123"
    And the user navigates to "Marketing" -- "Campaigns"
    When the user clicks on "Create Campaign" button
    And "Create Campaign" subtitle should be displayed
    And the user sent keys to "<fieldName>" field as "<value>"
    When the user clicks on "Save" button
    Then the user verifies the message as "<message>"
    Examples:
      | message                                                        |
      | This value is too long. It should have 100 characters or less. |
      | This value should not be blank.                                |
      | This value should not be numeric.                              |
      | This value is too long. It should have 20 characters or less.  |
      | This value should not be blank.                                |
      | This value should be a valid number.                           |