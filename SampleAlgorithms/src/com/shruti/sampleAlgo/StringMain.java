package com.shruti.sampleAlgo;

import java.util.Scanner;

public class StringMain {

	static String extractInt(String str) {
		// Replacing every non-digit number
		// with a space(" ")
		str = str.replaceAll("[^\\d]", " ");

		// Remove extra spaces from the beginning
		// and the ending of the string
		str = str.trim();

		// Replace all the consecutive white
		// spaces with a single space
		str = str.replaceAll(" +", "");

		if (str.equals(""))
			return "0";

		return str;
	}

	static String deleteDuplicateChar(String s) {

		String temp = null;
		for (int i = 0; i <= s.length() - 1; i++) {
			for (int j = i + 1; j <= s.length() - 1; j++) {
				if (s.charAt(i) == s.charAt(j)) {
					temp = String.valueOf(s.charAt(i));
					s = s.replaceAll(temp, "");
					i = -1;
					break;
				}
			}

		}
		return s;
	}

	static String convertToLower(String s, int q) {
		int i = 1;
		int product = q - 1;

		while (product < s.length()) {
			String ch = String.valueOf(s.charAt(product));
			s = s.replaceFirst(ch, ch.toLowerCase());
			++i;
			product = (i * q) - 1;

		}
		return s;
	}

	static String convertToUpper(String s, int q) {
		int i = 1;
		int product = q - 1;

		while (product < s.length()) {
			String ch = String.valueOf(s.charAt(product));
			s = s.replaceFirst(ch, ch.toUpperCase());
			++i;
			product = (i * q) - 1;

		}
		return s;
	}

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		String input = obj.nextLine();
		obj.close();
		String intInput = extractInt(input);
		char[] arr = intInput.toCharArray();
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum = sum + Integer.parseInt(String.valueOf(arr[i]));
		System.out.println(sum);

	}
}
