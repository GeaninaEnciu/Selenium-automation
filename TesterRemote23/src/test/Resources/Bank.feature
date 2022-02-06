Feature: Testing Bank Account
  Scenario: Withdraw money available in a user account
    Given Bank account with 1000 EUR
    When A user withdraw 500 EUR
    Then the withdraw operation should be possible
    And The account balance should be 500 EUR


  Scenario: Try to withdraw more money than available in a user account
    Given Bank account with 1000 EUR
    When A user withdraw 1500 EUR
    Then the withdraw operation should not be possible
    And The account balance should be 1000 EUR


  Scenario: Withdraw money available in a user account
    Given Bank account with 1000 EUR
    When A user withdraw 1000 EUR
    And A user transfer 2000 EUR
    And A user withdraw 500 EUR
    Then the withdraw operation should be possible
    And The account balance should be 1500 EUR


  Scenario Outline: Transfer money
    Given Bank account with <value> Euro
    And A user transfer <transfer> Euro
    Then The account balance should be <final_balance> Euro

    Examples:

      | value | transfer | final_balance |
      | 1     | 50       | 51            |
      | 700   | 300      | 1000          |
