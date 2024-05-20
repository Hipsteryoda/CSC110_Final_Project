package com.testFinalProject.app;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DoubleDice {
  public static void printMoney(double money) {
    System.out.print("You have $");
    System.out.printf("%.2f\n", money);
  } 

  public static void quitMessage() {
    System.out.println("See you around, winner!");
  }

  public static void outOfMoneyMessage() {
    System.out.println("You are out of money...");
    System.out.println("Better luck next time!");
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

  public static double playHand(double bet, double money, Die die1, Die die2) {
    die1.roll();
    die2.roll();
    
    // tell user what they rolled
    System.out.println("You rolled a " + die1.toString() + " and a " + die2.toString());

    // Check the value of the dice
    if (die1.equals(die2)) {
      money += bet;
      System.out.print("You win $");
      System.out.printf("%.2f\n\n", bet);
    }
    else {
      // System.out.println("Die 1: " + die1.getValue() + " Die 2: " + die2.getValue());
      money -= bet;
      System.out.print("You lose $");
      System.out.printf("%.2f\n\n", bet);
    }
    return money;
  }

  public static void main(String[] args) {
    // instantiate a Scanner object, and two Die objects
    Scanner scnr = new Scanner(System.in);
    Die die1 = new Die();
    Die die2 = new Die();
    // initialize currentMoney and declare currentBet 
    double currentMoney = 100;
    double currentBet;
    boolean run = true;

    // all double checking done through Double built-in method .compare()    
    while ( (Double.compare(currentMoney, 0.0) > 0) && (run) ) {
       // Initial prompt and reading currentBet
      printMoney(currentMoney);
      System.out.print("How much would you like to bet (Enter 0 to quit)? ");

      try {
        currentBet = scnr.nextDouble();
        if (Double.compare(currentBet, 0.0) == 0) {  // exit the program if 0
          run = false;
          quitMessage();
          break;
        }
        else if (Double.compare(currentBet, currentMoney) > 0) { // check the user is not betting more than they have
          betTooBigMessage(scnr);
        }
        else if (Double.compare(currentBet, 0.0) < 0) {   // make sure bet is positive number
          negativeBetMessage(scnr);
        }
        else {  // play a round
          currentMoney = playHand(currentBet, currentMoney, die1, die2);
        }
      }
      catch (InputMismatchException e) { // catches anything that isn't a double or can't be cast to one inherently
        invalidInputMessage(scnr);
      }
    }

    if (Double.compare(currentMoney, 0.0) == 0) { // check if out of money
      outOfMoneyMessage();
    }
    
  }

}
