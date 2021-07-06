package com.shruti.sampleAlgo;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}

		// Reverse number
		int num = 12345, digit = 0, reverseNum = 0, sum = 0, sumeven = 0;

		while (num != 0) {
			digit = num % 10;
			reverseNum = reverseNum * 10 + digit;
			num = num / 10;
			if (digit % 2 == 0)
				sumeven = sumeven + digit;
			sum = sum + digit;

		}

		System.out.println(reverseNum);
		System.out.println(sumeven);
		System.out.println(sum);

	}

}