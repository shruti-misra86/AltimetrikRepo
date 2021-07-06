package com.shruti.sampleAlgo;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		String s = obj.nextLine();
		obj.close();
		s = s.replaceAll(";", "");
		System.out.println(s);
	}
}