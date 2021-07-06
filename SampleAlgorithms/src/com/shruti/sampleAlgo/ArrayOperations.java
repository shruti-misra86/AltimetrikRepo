package com.shruti.sampleAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {

	public static void main(String[] args) {
		// int arr[] = { 1, 2, 5, -2, -3, 3, 3, 3, -4 };
		// removeDuplicateElements(arr, arr.length);
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter length of array : ");
		int n = s1.nextInt();
		int[] arr = new int[n];
		Scanner s2 = new Scanner(System.in);
		int i = 0;
		while (i < n) {
			System.out.println("enter " + (i + 1) + " integer : ");
			arr[i++] = s2.nextInt();

		}
		rearrange(arr, n);
		for (int j : arr)
			System.out.print(j + " ");
		s1.close();
		s2.close();
	}

	public static void frequencyOfNumbers(int[] arr) {
		// frequency of a number
		for (int i = 0; i < arr.length; i++) {
			int[] frequency = new int[arr.length];
			int num = arr[i];
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == num) {
					count++;
				}
				frequency[j] = count;
			}
			System.out.println("Number " + num + " frequency is : " + count);

		}
	}

	public static int getSecondLargest(int[] a, int total) {
		int temp;
		// sorting array in ascending order
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 2];
	}

	public static void removeDuplicateElements(int arr[], int n) {
		if (n == 0) {
			System.out.println("empty array");
		}
		// sorting array
		Arrays.sort(arr);

		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		// printing array elements
		for (int i = 0; i < j; i++)
			System.out.print(arr[i] + " ");
	}

	public static void rearrange(int arr[], int n) {

		ArrayList<Integer> pos = new ArrayList<Integer>();
		ArrayList<Integer> neg = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			if (arr[i] >= 0)
				pos.add(arr[i]);
			else
				neg.add(arr[i]);

		}

		int i = 0, j = 0, k = 0;

		while (j < pos.size() && i < neg.size()) {
			arr[k++] = pos.get(j++);
			arr[k++] = neg.get(i++);

		}
		while (j < pos.size()) {
			arr[k++] = pos.get(j++);
		}

		while (i < neg.size()) {
			arr[k++] = neg.get(i++);
		}

	}

}
