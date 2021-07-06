package com.shruti.sampleAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	/*
	 * public static void sort(int[] arr) { for (int n = 0; n < arr.length - 1; n++)
	 * { for (int m = n + 1; m < arr.length; m++) { if (arr[n] > arr[m]) { int temp
	 * = arr[n]; arr[n] = arr[m]; arr[m] = temp; } } } }
	 */

	public static void frequencyOfNumbers(int[] arr, int len) {
		// frequency of a number
		int[] frequency = new int[len];
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < len; i++) {
			int num = arr[i];
			int count = 0;
			for (int j = 0; j < len; j++) {
				if (arr[j] == num) {
					count++;
				}
				frequency[j] = count;
			}
			System.out.println("Number " + arr[i] + " frequency is : " + frequency[i]);
			map.put(arr[i], frequency[i]);

		}
		// Construct an ArrayList holding all Entry objects of elementCountMap

		ArrayList<Entry<Integer, Integer>> listOfEntry = new ArrayList<>(map.entrySet());

		// Sort listOfEntry based on values

		Collections.sort(listOfEntry, new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		// Print sorted array elements in descending order of their frequency

		// System.out.println("Sorted Array Elements In Descending Order Of Their
		// Frequency :");

		for (Entry<Integer, Integer> entry : listOfEntry) {
			int freq = entry.getValue();

			while (freq >= 1) {
				System.out.print(entry.getKey());
				if (freq != 1)
					System.out.println(" ");
				freq--;
			}
		}

	}

	public static void main(String a[]) {
		Scanner s = new Scanner(System.in);

		int lengthArray = s.nextInt();
		String input2 = s.nextLine();

		s.close();

		String s1[] = input2.split(" ");
		int intArray[] = new int[s1.length];
		for (int i = 0; i < s1.length; i++)
			intArray[i] = Integer.parseInt(s1[i]);
		// sort(intArray);

		frequencyOfNumbers(intArray, lengthArray);

	}
}
