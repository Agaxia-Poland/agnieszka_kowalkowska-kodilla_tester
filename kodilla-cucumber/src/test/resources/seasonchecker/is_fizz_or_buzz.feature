Feature: This is a game "Fizz or Buzz"?
  If the number is divided by 3 say fizz, if by 5 say buzz, if by 3 & 5 say fizzbuzz.

  Scenario Outline: Say fizz/buzz/fizzbuzz to right number.
    Given the number is <number>
    When I ask for the right word to the given number
    Then You should say <answer>
    Examples:
      | number  | answer
      | 3  | "Fizz" |
      | 6 | "Fizz" |
      | 9  | "Fizz"  |
      | 5  | "Buzz" |
      | 50  | "Buzz" |
      | 25 | "Buzz"   |
      | 15  | "FizzBuzz" |
      | 30  | "FizzBuzz" |
      | 60  | "FizzBuzz" |
      | 123  | "None" |
      | 1  | "None" |
