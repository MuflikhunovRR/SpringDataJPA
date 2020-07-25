Feature: Сheck records in a db table

  Scenario: Check records in Person table (should be 5)
    Then get all: 5 records from Person table

  Scenario: Check records in Geography table (should be 4)
    Then get all: 4 records from Geography table