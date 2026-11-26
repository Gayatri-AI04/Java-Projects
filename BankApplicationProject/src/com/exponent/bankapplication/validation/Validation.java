package com.exponent.bankapplication.validation;

import java.util.Scanner;

public class Validation {
	static Scanner sc = new Scanner(System.in);

	public static long accountNumber() {

		long acNo = (long) (Math.random() * Math.pow(10, 12));
		return acNo;
	}

	public static long contactNumber() {

		long number = sc.nextLong();
		if (number > 6000000000l && number < 9999999999l) {
			return number;
		} else {
			System.out.println("Invalid Number, please enter Again");
			return contactNumber();
		}
	}
}
