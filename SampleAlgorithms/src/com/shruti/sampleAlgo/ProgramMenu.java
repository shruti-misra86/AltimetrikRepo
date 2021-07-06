package com.shruti.sampleAlgo;

import java.util.Scanner;

public class ProgramMenu {

	static void isPrime(int n) {
		int i, m = 0, flag = 0;
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not a prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not a prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is a prime number");
			}
		} // end of else
	}

	// To reverse Digits of numbers
	static int reverseDigits(int num) {
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		return rev;
	}

	// To square number
	static int square(int num) {
		return (num * num);
	}

	// To check Adam Number
	static void isAdam(int num) {
		// Square first number and square
		// reverse digits of second number
		int a = square(num);
		int b = square(reverseDigits(num));

		// If reverse of b equals a then given
		// number is Adam number
		if (a == reverseDigits(b))
			System.out.println(num + " is an Adam Number");
		else
			System.out.println(num + " is not an Adam Number");
	}

	static void isAmicable(int n, int m) {
		int sum1 = 0, sum2 = 0;
		for (int i = 1; i < n; i++) {
			// finds the divisors of the first number
			if (n % i == 0)
				// finds the sum of divisors of the first number
				sum1 = sum1 + i;

		}
		for (int i = 1; i < m; i++) {
			// finds the divisors of the second number
			if (m % i == 0)
				// finds the sum of divisors of the second number
				sum2 = sum2 + i;

		}
		// comparing the sum of divisors with the given numbers
		// returns true if both conditions are true
		if ((n == sum2) && (m == sum1))
			System.out.println(n + ", " + m + " are amicable numbers.");
		else
			System.out.println(n + ", " + m + " are not amicable numbers.");

	}

	static void isPerfect(int n) {
		// 1 is not a perfect number
		if (n == 1)
			System.out.println(n + " is not a perfect number");

		// sum will store the sum of proper divisors
		// As 1 is a proper divisor for all numbers
		// initialized sum with 1
		int sum = 1;

		// Looping through the numbers to check if they are
		// divisors or not
		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				sum += i;
			}

		}

		// If sum of divisors is equal to
		// n, then n is a perfect number
		if (sum == n)
			System.out.println(n + " is  a perfect number");
		else
			System.out.println(n + " is not a perfect number");
	}

	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("enter your choice of program : ");
			System.out.println("1.prime number :");
			System.out.println("2.adam number :");
			System.out.println("3.amicable number :");
			System.out.println("4.perfect number :");
			System.out.println("5.exit");
			switch (s.nextInt()) {
			case 1:
				System.out.println("enter a number : ");
				int num1 = s.nextInt();
				System.out.println("check Prime number");
				isPrime(num1);
				break;
			case 2:
				System.out.println("enter a number : ");
				int num2 = s.nextInt();
				System.out.println("check Adam number");
				isAdam(num2);
				break;
			case 3:
				System.out.println("check Amicable number");
				System.out.println("enter first number : ");
				int num3a = s.nextInt();
				System.out.println("enter second number : ");
				int num3b = s.nextInt();
				isAmicable(num3a, num3b);
				break;
			case 4:
				System.out.println("check Perfect number");
				System.out.println("enter a number : ");
				int num4 = s.nextInt();
				isPerfect(num4);
				break;
			case 5:
				System.out.println("exit");
				s.close();
				System.exit(0);
			default:
				System.out.println("invalid choice");
			}
		} while (true);

	}

}
