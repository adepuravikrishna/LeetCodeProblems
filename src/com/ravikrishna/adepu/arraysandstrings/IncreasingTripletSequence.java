/**
 * 
 */
package com.ravikrishna.adepu.arraysandstrings;

/**
 * 
 *
 */
public class IncreasingTripletSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 5, 1, 5, 5, 2, 5, 4 };
		boolean check = checkIfIncreasingSequence(arr);
		System.out.println(check);

	}

	private static boolean checkIfIncreasingSequence(int[] arr) {
		int small = Integer.MAX_VALUE, secondBig = Integer.MAX_VALUE;
		for (int n : arr) {
			if (n <= small) {
				small = n;
			} else if (n <= secondBig) {
				secondBig = n;
			} else
				return true;
		}

		return false;
	}

}
