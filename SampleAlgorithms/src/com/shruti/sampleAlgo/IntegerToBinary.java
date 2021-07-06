package com.shruti.sampleAlgo;

import java.nio.charset.Charset;
import java.util.Scanner;

public class IntegerToBinary {

	public static void main(String[] args) {
///////////////////////////////////////////////////////////
		// Getting input via STDIN
		Scanner obj = new Scanner(System.in);
		int userInput[] = new int[3];
		for (int i = 0; i < 3; i++) {
			userInput[i] = obj.nextInt();
		}

		for (int i = 0; i < 3; i++) {
			System.out.print(userInput[i]);
		}
///////////////////////////////////////////////////////////////////
	}
}
//char[] arr = userInput1.toCharArray();