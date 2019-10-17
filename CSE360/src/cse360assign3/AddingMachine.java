/*
 * Author: Brian Dang
 * Class: CSE360 (85141)
 * Date: 10/17/19
 * Assignment 3
 * 
 * Description: AddingMachine is the base of the project. Has constructor, total and a string for the history.
 * Also it has the simple calculator functions to add or subtract from the protect variable total.
 */
package cse360assign3;

public class AddingMachine {

	protected int total;
	protected String previousHistory = "0";
	
	public AddingMachine () {		//Constructor for AddingMachine
		total = 0; //not needed - included for clarity
	}
	
	public int getTotal () {		//Returns the current total.
		return total;
	}
	
	public void add (int value) {		//Adds input value to total.
		total = total + value;
		previousHistory =  previousHistory + " + " + value;
	}
	
	public void subtract (int value) {		//Subtracts input value from total.
		total = total - value;
		previousHistory =  previousHistory + " - " + value;
	}
	
	public String toString () {		//Print string of all previous add or subtract uses. Ex: 0 + 4 � 2 + 5
		return (previousHistory);
	}
	
	public void clear () {		//Clear AddingMachine variable(s).
		total = 0;
		previousHistory = "0";
	}
	
	
	
}
