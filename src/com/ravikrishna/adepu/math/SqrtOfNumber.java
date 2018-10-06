package com.ravikrishna.adepu.math;

public class SqrtOfNumber {

	public static void main(String[] args) {
		int x = 8;
		int result = mySqrt(x);
		System.out.println(result);

	}

	private static int mySqrt(int x) {
	    if (x <= 1) return x;
        int lo = 1, hi = x/2;
        while (lo < hi) {
            int mid = lo + (hi - lo + 1) / 2;
            System.out.println("Current mid value "+mid);
            if (mid <= x/mid) {
                lo = mid;
                System.out.println("Adjusted left value to "+lo);
            } else {
                hi = mid - 1;
                System.out.println("Adjusted hi value to "+hi);
            }
        }
        return lo;
	}

}
