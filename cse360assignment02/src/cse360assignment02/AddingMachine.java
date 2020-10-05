package cse360assignment02;

public class AddingMachine {
  private int total;
  private String equation = "0"; //history string
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () { //returns the total value
    return total;
  }
  
  public void add (int value) { // adds a number to the total, then updates the toString string
	  total += value;
	  equation += " + " + value;
	  
  }

  public void subtract (int value) { // subtracts a number from the total, then updates the toString string
	  total -= value;
	  equation += " - " + value;
  }

  public String toString () { //returns the final string with all added changes to the total
    return equation;
  }

  public void clear() { //resets total and the history string
	  total = 0;
	  equation = "0";
  }
  
  
}

