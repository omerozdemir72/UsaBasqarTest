Feature: Create a Country

  Scenario Outline: Country Creating and Deleting
    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on City
    And Click on plus icon
    And Choose any value from the dropdown
    And Type in the Name "<CityName>"
    When Click on save button
    Then "<CityName>" should be displayed
    And Remove the data "<CityName>"
    Then Verify data is removed "<CityName>"
    Examples:
      | CityName |
      | city A    |
      | city B    |
      | city C    |