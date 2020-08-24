Feature: Create a Country

  Scenario: Country Creating and Deleting


    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on countries
    And Click on plus icon
    And type a name
    And type a code
    When click save button
    Then name should be displayed
    And Remove the data
    Then verify data is removed


