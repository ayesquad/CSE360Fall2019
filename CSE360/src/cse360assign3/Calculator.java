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
		if (value < 0) {		//If you raised the number to a negative number, total = 0.
			total = 0;
		}
		else {
			total =  (int) Math.pow(total, value);
			previousHistory = previousHistory + " ^ " + value;
		}
	}

}
