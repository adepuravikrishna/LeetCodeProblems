package com.ravikrishna.adepu.arraysandstrings;

public class RansomNoteProblem {

	public static void main(String[] args) {
		String str = "aa", str2 = "aab";
		boolean result = canConstruct(str, str2);
		System.out.println(result);

	}

	public static boolean canConstruct(String ransomNote, String magazine) {

		int notelength = ransomNote.length();
		int magzinelength = magazine.length();
		int[] result = new int[26];

		for (int i = 0; i < magzinelength; i++) {
			int val = magazine.charAt(i) - 'a';
			++result[val];
		}

		for (int i = 0; i < notelength; i++) {
			int val = ransomNote.charAt(i) - 'a';
			if (result[val] == 0) {
				return false;
			}else {
				--result[val];
			}
		}
		
		return true;

	}

}
