package com.ravikrishna.adepu.arraysandstrings;

public class MsftTest {

	public static void main(String[] args) {

		String s = "   This    is a test! continue  ";
		System.out.println(s);

		//		System.out.println(reverseString(s));
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int j = i;
			while (i < ch.length && ch[i] == ' ') {
				i++;
				j++;
			}
			while ( i < ch.length && ch[i] != ' ') i++;
			
			reverse(ch, j, i-1);
		}
		
//		String sh = "";
//		String t = new String();
//
//		for (int i = 0; i < ch.length; i++) {
//
//			if (ch[i] == ' ' || i == ch.length -1) {
//				if (i == ch.length -1) {
//					t = t + ch[i];
//				}
//				sh = sh + reverse(t) + " ";
//				t = new String();
//
//			} else {
//				t = t + ch[i];
//			}
//		}
//
		System.out.println(String.valueOf(ch));
	}
	
	
//	public static String reverseString(String str)
//	{
//		String reverse ="";
// 
//		if (str.length() == 1)
//		{
//			return str;
//		}
//		else
//		{
//			reverse += str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
//			return reverse;
// 
//		}
//	}

	private static char[] reverse(char[] ch, int low, int high) {
		while (low < high) {
			char temp = ch[high];
			ch[high] = ch[low];
			ch[low] = temp;
			low++;
			high--;
		}

		return ch;
	}

}
