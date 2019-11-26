Feature: Search Property For Sale
  As a customer
  I want the ability to search for any property of my choice in any location
  So that I can buy the property

  Scenario Outline: Customer can search for any property
    Given I navigate to zoopla homepage
    When  I enter a "<location>" in the search text box
    And I select "<MinPrice>" from Min price dropdown
    And I select "<MaxPrice>" from Max price dropdown
    And I select "<Property>" from property type dropdown
    And I select "<Bed>" from bedrooms dropdown
    And i click on Search button
    Then a list of "<PropertyType>" in "<location>" are displayed

    Examples:
    |Location|MinPrice|MaxPrice|Property|Bed|PropertyType|
    |Manchester|£120,000|£230,00|Houses|3+      |Houses|
    |London|£250,000|£400,00|Farms/land|No min      |Property|
    |Coventry|£120,000|£230,00|Flats|3+      |Flats|
    |Birmingham|      |     |      |     |     |


  Scenario Outline: Customer cannot search for property with missing values
    Given I navigate to zoopla homepage
    When  I enter a "<location>" in the search text box
    And I select "<MinPrice>" from Min price dropdown
    And I select "<MaxPrice>" from Max price dropdown
    And I select "<Property>" from property type dropdown
    And I select "<Bed>" from bedrooms dropdown
    And i click on Search button
    Then an error message is displayed