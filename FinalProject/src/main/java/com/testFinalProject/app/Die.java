package com.testFinalProject.app;

import java.util.Random;

public class Die {
  private int dieValue;
  Random randNum;

  public Die() { 
    dieValue = 0;
    randNum = new Random();
  }

  public int getValue() {
    return dieValue;
  }

  public void roll() {
    dieValue = randNum.nextInt(6) + 1;  // random.nextInt() has an inclusive 0; add 1 to it
  }

  public boolean equals(Die die2) {
    if (die2.getValue() == dieValue) {
      return true;
    }
    else {
      return false;
    }
  }

  public String toString() {
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

