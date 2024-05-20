package com.testFinalProject.app;

import java.util.Random;  // Random class for random number generation

public class Die {
  private int dieValue;
  Random randNum;

  public Die() {  // constructor for Die 
    dieValue = 0;
    randNum = new Random();
  }

  public int getValue() {   // retrieves die value
    return dieValue;
  }

  public void roll() {  // sets the die value to a new random number; simulates a roll
    dieValue = randNum.nextInt(6) + 1;  // random.nextInt() has an inclusive 0; add 1 to it
  }

  public boolean equals(Die die2) {   // checks equality to a second die object 
    if (die2.getValue() == dieValue) {
      return true;
    }
    else {
      return false;
    }
  }

  public String toString() {  // converts the die value to a string with a basic switch-case statement
    String stringValue;
    switch (dieValue) {
      case 1:
        stringValue = "one";
        break;
      case 2:
        stringValue = "two";
        break;
      case 3:
        stringValue = "three";
        break;
      case 4:
        stringValue = "four";
        break;
      case 5:
        stringValue = "five";
        break;
      case 6:
        stringValue = "six";
        break;
      default:
        stringValue = "none";
    }
    return stringValue;
  }
}

