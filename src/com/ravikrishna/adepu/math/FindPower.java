package com.ravikrishna.adepu.math;

public class FindPower {
	public static void main(String[] args) {
		double x = 0.00001;
		int n = 2147483647;

		double result = myPow(x, n);
		System.out.println(result);

	}

	private static double myPow(double x, int n) {
		double result = 1;
		boolean negative = false;
		if (n < 0) {
			negative = true;
			n = -n;
		}

		while (n != 0) {
			if (negative) {
				result = result / x;
			} else {
				result = result * x;
			}

			n--;
		}
		return result;
	}

}
