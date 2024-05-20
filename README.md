# Program Requirements
Your program should have two classes:

- Die Class – Class that simulates a six-sided die.
- DoubleDice Class – Class that contains game looping and logic.

Your Die Class should contain the following methods:

- Constructor method:  Initializes the die’s value to 0 and instantiates the Random object.
- roll() method – uses the Random object to simulate a die roll between 1 and 6.
- equals(Die die2) method – returns Boolean true if both die have equal values, false otherwise.
- toString() method – returns the String “one”, “two”, “three”, “four”, “five”, or “six” depending on the value of the die.

Your DoubleDice Class should contain the following methods:

- Contain main logic for playing the game.
- Reference your Die Class and corresponding methods for die rolling.
- May either have statements all in a main() method or split logic up in separate methods.

The Game of Double Dice:  Sample Output  #1

```
You have $100.00
How much would you like to bet (Enter 0 to quit)? 50
You rolled a three and three
You win $50.00

You have $150.00
How much would you like to bet (Enter 0 to quit)? 50
You rolled a six and two
You lose $50.00

You have $100.00
How much would you like to bet (Enter 0 to quit)? 100
You rolled a three and four
You lose $100.00

You are out of money!
Better luck next time
The Game of Double Dice:  Sample Output  #2

You have $100.00
How much would you like to bet (Enter 0 to quit)? 25
You rolled a six and three
You lose $25.00

You have $75.00
How much would you like to bet (Enter 0 to quit)? 75
You rolled a six and six
You win $75.00

You have $150.00
How much would you like to bet (Enter 0 to quit)? 0

See you around, winner!
```
