package assign1;

/*
 * Author: Brian Dang
 * Class ID: 1213706089 or bdang2 or RC1
 * Assignment 1
 * 
 * File Summary: 
 * This File contains the Palindrome class with the function isPalindrome() to
 * determine if string is a palindrome. A palindrome is a word or phrase consisting of alphanumeric characters 
 * that reads the same frontwards and backwards while ignoring cases, punctuation and white spaces.
 */

//Palidrome class contains a String called testString. Has a contructor Palidrome() and a function to find
//if testString isPalidrome().
public class Palindrome {
	
	private String testString;
	
	Palindrome (String x) {		//Constructor to Initialize testString variable. Parameter is a String input.
		testString = x;
	}
	
	boolean isPalindrome() {	//Checks to see if testString is a Palindrome.
		int i = 0;
		testString = testString.replaceAll("[^a-zA-Z]" , "");	//Replaces everything that is not a letter to a null; 
		char array[] = testString.toCharArray();
		int length = array.length;
		boolean answer = true;	
		
		while (i < length / 2) {
			
			if (testString.toLowerCase().charAt(i) != testString.toLowerCase().charAt(length - (i + 1)) ) {	//Makes testString all lowercase then compares first character
																											//of string to last character of string and so forth.
				answer = false;			
			}
			
			i++;
		}
		return answer; //Returns true or false if testString was a Palindrome or not.
	}
}
