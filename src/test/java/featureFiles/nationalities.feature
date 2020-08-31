Feature: Create a Nationality

  Background:
    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on Nationalities
    And Click on plus icon


  Scenario: Create German
    And type a name "German"
    When click save button
    Then name should be displayed "German"


  Scenario:Create Turkish
    And type a name "Turkish"
    When  click save button
    Then name should be displayed "Turkish"
    
    





