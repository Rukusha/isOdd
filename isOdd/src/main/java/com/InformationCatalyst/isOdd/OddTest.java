package com.InformationCatalyst.isOdd;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Write a boolean method called isOdd() in a class called OddTest, which takes an int as input and returns true if the it is odd. 
//Also write the main() method that prompts user for a number, and prints "ODD" or "EVEN". You should test for negative input.
public class OddTest {

	private static final Logger logger = LoggerFactory.getLogger(OddTest.class);
	static int userInt = 0;

	public static void main(String[] args) {

		Scanner userIn = new Scanner(System.in);

		logger.info("Enter a odd Number");
		userInt = userIn.nextInt();

		if (userInt <= 0) {
			logger.info("Number is a negative value");
		}
		else {
			if (isOdd() == true) {
				logger.info("ODD");
			} else {
				logger.info("EVEN");
	
			}
		userIn.close();
		}
	}

	private static boolean isOdd() {
		if (userInt % 2 > 0) {
			if (true) {
				return true;
			}
		}
		return false;
	}
}
