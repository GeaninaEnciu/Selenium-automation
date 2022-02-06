Feature: Fizz Buzz game test

  Scenario: Multiple of 3
 Given start a FizzBuzz game play
    When I play with number 9
    Then I see result is "fizz"

    Scenario: Multiple of 5
      Given start a FizzBuzz game play
      When I play with number 75
      Then I see result is "buzz"


      Scenario: Multiple of 3 and 5
        Given start a FizzBuzz game play
        When I play with number 15
        Then I see result is "fizzbuzz"

        Scenario: Number is not multiple of 3 or 5
          Given start a FizzBuzz game play
          When I play with number 8
          Then I see result is  "8"

          Scenario Outline: multiple of 3 (3, 6 9, 12)
            Given start a FizzBuzz game play
            When I play with number <number>
            Then I see result is <number>

            Examples:
            |number | result|
            |3      |fizz     |
            |6      |fizz     |
            |9      |fizz     |
            |12     |fizz     |

