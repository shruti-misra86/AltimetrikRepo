package com.shruti.sampleAlgo;

public class LeapYear {

	public static void main(String[] args) {
		int year = 1900;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					System.out.println("its a leap year");
				else
					System.out.println("its not a leap year");
				System.exit(0);
			}
			// A leap year is exactly divisible by 4 except for century years (years ending
			// with 00). The century year is a leap year only if it is perfectly divisible
			// by 400.
			System.out.println("year is not a century and it is a leap year");
		}

	}
}