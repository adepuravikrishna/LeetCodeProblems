package com.ravikrishna.adepu.math;

import java.util.HashSet;

public class HappyNumbers {

	public static void main(String[] args) {

		int num = 2;

		System.out.println(isHappy(num));

	}

	public static boolean isHappy(int num) {
		int total = 0;
		HashSet<Integer> hs = new HashSet<>();
		while (true) {
			while (num > 0) {
				int i = num % 10;
				total = total + i * i;
				num = num / 10;
			}
			if (total == 1) {
				return true;

			} else {
				if (hs.contains(total)) {
					return false;

				} else {
					hs.add(total);
					System.out.println(total);
					num = total;
					total = 0;

				}

			}

		}

	}

}
