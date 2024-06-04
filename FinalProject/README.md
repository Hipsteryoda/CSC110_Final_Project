# CSC110 Final Project
This project is a small, CLI dice game built for CSC110 - Java Final Project.

## Project Structure
Project was built using Apache Maven. Die and DoubleDice source and class files are located in `FinalProject/src/main/java/com/finalProject/app/`.

# How to play the game of Double Dice

The player begins with $100.00.  The player is asked for a bet amount, and then a pair of dice are rolled.  If the two values on the dice are the same (if the player rolled doubles), the player wins an amount equal to their bet amount.  If the two values on the dice do not match, the player loses their bet amount.  The game ends when either the player decides to end the game, or when the player runs out of money.

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

# Programming Tips
- Remember that you can’t reliably test if (money == 0) when the money variable is a float.  You’ll have to use the floating-point comparison technique.  Review Section 4.17.
- Be sure to use comments in your code!  Your instructor will be manually reviewing your code.  He or she won’t have the time to play all the Double Dice games;  comments will help guide the instructor (and other programmers) around your code.  Comment accordingly.
- Be sure to thoroughly test your code!  Be sure your output matches the pattern of the sample output provided; creative latitude is allowed, however, the following use cases should be checked by you, and will be checked by the instructor:
    - [x] Amounts printed as dollars must show a dollar sign with two decimal places.
    - [x] You must be able to bet in dollars AND cents, and not just whole dollars.
    - [x] The output must show the dice rolls, whether or not the player won, how much the player won or lost, and the dollar amount the player has at the beginning of each turn.  The bet prompt should contain some instruction around how the player can exit the game, i.e. "Enter 0 to quit."
    - [x] You may follow the sample output provided, or use your own wording.
    - [x] You will have to play your game many, many times to be sure it is working properly.
    - [x] Check to be sure the player is paid when they win and the player’s account is deducted when the player loses.
    - [x] Be sure the player actually wins when the dice are the same, and actually loses when the dice are different.
    - [x] The player also should not be able to bet a negative number, or zero dollars; the player should not be able to bet more than they have.
    - [x] The player also should not be able to bet a non-numeric value, like “frog”.  The program should not crash if the player enters a non-numeric bet.
    - [x] The game should automatically end when the player runs out of money.
