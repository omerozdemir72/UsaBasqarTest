Feature: Create a Country

  Scenario Outline: Country Creating and Deleting
    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on countries
    And Click on plus icon
    And type a name"<name>"
    And type a code"<code>"
    When click save button
    Then name should be displayed "<name>"
    And Remove the data
    Then verify data is removed "<name>"

    Examples:

    |name| code|
    |Turkey|TR01|
    |Germany|GM01|
    |France |FR05  |


