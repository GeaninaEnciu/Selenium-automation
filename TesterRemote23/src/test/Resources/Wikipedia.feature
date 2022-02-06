Feature: Test Wikipedia

  Scenario: Search into about BDD
    Given I am on the Wikipedia search page
    When I search for "BDD"
    Then the page title should start with "BDD"
