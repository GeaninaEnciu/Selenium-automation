Feature: calculator
As a user I want to do math operation to be able to do math

  Scenario: Add 2 numbers
    Given Calculator app is opened
    When I click 4
    And I click +
    And I click 3
    And I click =
    Then I see result is 7
  Scenario Outline: Add 2 numbers (2)
    Given Calculator app is opened
    When I click <no1>
    And I click +
    And I click <no2>
    And I click =
    Then I see result is <result>
    Examples:
      |no1|no2|result|
      |4 | 3  |7      |
      |20| 30 |50 |
      |100|200|300|
  Scenario Outline: Divide 2 numbers
    Given Calculator app is open
    When I click <no1>
    And I click /
    And I click <no2>
    And I click =
    Then I see result is <result>
    Examples:
      |no1|no2|result|
      |10 | 2  |5      |
      |15 |3   |5|
      |80 |2   |40|