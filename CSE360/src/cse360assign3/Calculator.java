/*
 * Author: Brian Dang
 * Class: CSE360 (85141)
 * Date: 10/17/19
 * Assignment 3
 * 
 * Description: Calculator extends AddingMachine that includes the functions from a calculator to 
 * multiply, divide and do the power of AddingMachine's 'total' variable.
 */

package cse360assign3;

public class Calculator extends AddingMachine {
	public Calculator() {
		super();
	}
	
	public void mult (int value) {
		total = total * value;
		previousHistory = previousHistory + " * " + value;
	}
	
	public void div (int value) {
		if (value == 0) {		//if you divide by 0 then total = 0;
			total = 0;
		}
		else {
			total = total / value;
			previousHistory = previousHistory + " / " + value;
		}
		
	}
	
	public void power (int value) {
		if (value < 0) {		//If you raised number by a negative number, total = 0.
			total = 0;
		}
		else {
			total =  (int) Math.pow(total, value);
			previousHistory = previousHistory + " ^ " + value;
		}
	}

}
