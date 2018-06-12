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
		System.out.println("Rotate array by method 1:");
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		display(arr);
		// Rotate the array by two numbers
		rotate1(arr, arr.length, 2);
		display(arr);
		System.out.println("\nRotate array by method 2:");
		arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		display(arr);
		// Rotate the array by two numbers
		rotate2(arr, arr.length, 2);
		display(arr);
	}

	/**
	 * Display array elements.Time complexity is O(n).
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
	private static void rotate2(int[] arr, int n, int d) {
		if (null == arr || n <= 0 || d <= 0) {
			System.out.println("Invalid input");
			return;
		}
		for (int i = 0; i < d; i++) {
			int num = arr[0];
			int j = 0;
			for (; j < n - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = num;
		}
	}

}
