package com.testFinalProject.app;

import java.util.Scanner;

public class DoubleDice {
  public static void main(String[] args) {
    // instantiate a Scanner object, and two Die objects
    Scanner scnr = new Scanner(System.in);
    Die die1 = new Die();
    Die die2 = new Die();
    // initialize currentMoney and declare currentBet 
    int currentMoney = 100;
    int currentBet;

    
    while (currentMoney > 0) {
      // Initial prompt and reading currentBet
      System.out.println("You have $" + currentMoney);
      System.out.print("How much would you like to bet (Enter 0 to quit)? ");
      currentBet = scnr.nextInt();    // FIXME: don't let user bet more than remaining money
                                      // TODO: if user enters 0, print "See you around, winner!"
                                      // TODO: allow user to bet in dollars and cents 
                                      // TODO: don't allow the user to bet negative values
                                      // TODO: don't crash if the user enters a non-numeric value

      // Roll the dice
      die1.roll();
      die2.roll();
      
      // tell user what they rolled
      System.out.println("You rolled a " + die1.toString() + " and a " + die2.toString());

      // Check the value of the dice
      if (die1.equals(die2)) {
        currentMoney += currentBet;
        System.out.println("You win $" + currentBet);
        System.out.println("");
      }
      else {
        // System.out.println("Die 1: " + die1.getValue() + " Die 2: " + die2.getValue());
        currentMoney -= currentBet;
        System.out.println("You lose $" + currentBet);
        System.out.println("");
      }
    }
    System.out.println("You are out of money!");
    System.out.println("Better luck next time");
  }
}
