package com.shruti.sampleAlgo;

public class LeftRotateArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int rotate = 0;
		for (int j = 1; j <= rotate; j++) {
			int temp = arr[0];
			int i = 0;
			while (i < arr.length - 1) {
				arr[i] = arr[i + 1];
				i++;
			}
			arr[i] = temp;
		}
		for (int num : arr)
			System.out.print(num + " ");
	}
}