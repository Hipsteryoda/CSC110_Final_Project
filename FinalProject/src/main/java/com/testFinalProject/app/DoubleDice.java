package com.testFinalProject.app;

import java.util.Scanner;
import java.awt.Panel;
import java.util.InputMismatchException;

public class DoubleDice {
  public static void quitMessage() {
    System.out.println("See you around, winner!");
  }

  public static void outOfMoneyMessage() {
    System.out.println("You are out of money!");
    System.out.println("Better luck next time");
  }

  public static void invalidInputMessage(Scanner scnr) {
    System.out.println("Make sure your bet is a number. Please enter a valid bet amount.");
    scnr.nextLine();
    System.out.println();
  }

  public static void negativeBetMessage(Scanner scnr) {
    System.out.println("You know negative bets aren't real, right? Please enter a valid bet amount.");
    scnr.nextLine();
    System.out.println();
  }

  public static void betTooBigMessage(Scanner scnr) {
    System.out.println("Whoa there high roller, your bet is too large. Please enter a valid bet amount.");
    scnr.nextLine();
    System.out.println();
  }

  public static int playHand(int bet, int money, Die die1, Die die2) {
    die1.roll();                    // FIXME: the die values can come in as none. "You rolled a none and a four"
    die2.roll();
    
    // tell user what they rolled
    System.out.println("You rolled a " + die1.toString() + " and a " + die2.toString());

    // Check the value of the dice
    if (die1.equals(die2)) {
      money += bet;
      System.out.println("You win $" + bet);
      System.out.println("");
    }
    else {
      // System.out.println("Die 1: " + die1.getValue() + " Die 2: " + die2.getValue());
      money -= bet;
      System.out.println("You lose $" + bet);
      System.out.println("");
    }
    return money;
  }

  public static void main(String[] args) {
    // instantiate a Scanner object, and two Die objects
    Scanner scnr = new Scanner(System.in);
    Die die1 = new Die();
    Die die2 = new Die();
    // initialize currentMoney and declare currentBet 
    int currentMoney = 100;
    int currentBet;
    boolean quit = false;

    
    while ( (currentMoney > 0) || (!quit) ) {
       // Initial prompt and reading currentBet
      System.out.println("You have $" + currentMoney);
      System.out.print("How much would you like to bet (Enter 0 to quit)? ");
      try {
        currentBet = scnr.nextInt();    // FIXME: don't let user bet more than remaining money
                                        // TODO: allow user to bet in dollars and cents 
        if (currentBet == 0) {  // exit the program
          quit = true;
          quitMessage();
          break;
        }
        else if (currentBet > currentMoney) { // check the user is not betting more than they have
          betTooBigMessage(scnr);
        }
        else if (currentBet < 0) {
          negativeBetMessage(scnr);
        }
        else if(currentBet > 1) {
          currentMoney = playHand(currentBet, currentMoney, die1, die2);
        }
      }
      catch (InputMismatchException e) {
        invalidInputMessage(scnr);
      }
    }
  }
}
