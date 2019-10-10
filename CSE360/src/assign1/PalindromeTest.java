package assign1;
import static org.junit.jupiter.api.Assertions.*;

/*
 * Author: Brian Dang
 * Class ID: 1213706089 or bdang2 or RC1
 * Assignment 1
 * 
 * File Summary: 
 * This File is junit test that tests the isPalidrome() function to see if it correctly returns true or false.
 */

import org.junit.jupiter.api.Test;

class PalindromeTest {
	
	@Test
	void testIsPalindromeTrue() {		//Test isPalindrome() to see if it will produce true output.
		Palindrome p = new Palindrome("Nurses run!");
		assertTrue(p.isPalindrome());
		
		Palindrome pp = new Palindrome("RaceCar");
		assertTrue(pp.isPalindrome());
		
		Palindrome ppp = new Palindrome(" ");
		assertTrue(ppp.isPalindrome());
		
	}
	
	@Test
	void testIsPalindromeFalse() {					//Test isPalindrome() to see if it will produce false output.
		Palindrome p = new Palindrome("Noob Noob.");
		assertFalse(p.isPalindrome());
		
		Palindrome pp = new Palindrome("I am almost Done!");
		assertFalse(pp.isPalindrome());
	}


}
