package com.ravikrishna.adepu.math;

public class ExcelSerialColumnNumber {
	public static void main(String[] args) {
		String s = "BCM";
		int sum = 0;
		for(Character c: s.toCharArray()) {
			sum = (sum *26 ) + c -'A'+1;
			System.out.println(c);
		}
		
		System.out.println(sum);
	}

}
