package com.dj.ds.array;

/**
 * 
 * This class implements the array rotation functionality
 * 
 * @author Dipak Jadhav
 *
 */
public class RotateArray {
	/**
	 * Main method of the application
	 * 
	 * @param args
	 *            - Array of command line arguments
	 */
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		display(arr);
		// Rotate the array by two numbers
		rotate1(arr, arr.length, 2);
		display(arr);
	}

	/**
	 * Display array elements
	 * 
	 * @param arr
	 *            - Array of integers
	 */
	private static void display(int[] arr) {
		if (null != arr && arr.length > 0) {
			for (int n : arr) {
				System.out.print(n + " ");
			}
		}
		System.out.println();
	}

	/**
	 * Rotate the array
	 * 
	 * @param arr
	 *            - Array to be rotated
	 * @param n
	 *            - Length of array
	 * @param d
	 *            - Number by which array is rotated
	 */
	private static void rotate1(int[] arr, int n, int d) {
		if (null == arr || n <= 0 || d <= 0) {
			System.out.println("Invalid input");
			return;
		}
		int k = 0;
		// Create temporary array
		int[] temp = new int[d];
		for (; k < temp.length; k++) {
			temp[k] = arr[k];
		}
		int j = 0;
		for (; j < n - d; j++) {
			arr[j] = arr[k];
			k++;
		}
		for (int i = 0; i < temp.length; i++) {
			arr[j] = temp[i];
			j++;
		}
	}

}
