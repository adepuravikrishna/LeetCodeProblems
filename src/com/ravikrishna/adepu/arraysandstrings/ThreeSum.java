package com.ravikrishna.adepu.arraysandstrings;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class ThreeSum {

	public List<List<Integer>> threeSum(int[] num) {
	   	   Arrays.sort(num);
	       List<List<Integer>> res = new LinkedList<>(); 
	       for (int i = 0; i < num.length-2; i++) {
	           if (i == 0 || (i > 0 && num[i] != num[i-1])) {
	               if(num[i]>0)
	               break;
	               int lo = i+1, hi = num.length-1;
	               while (lo < hi) {
	                   if (num[lo] + num[hi] + num[i] == 0) {
	                       res.add(Arrays.asList(num[i], num[lo], num[hi]));
	                       while (lo < hi && num[lo] == num[lo+1]) lo++;
	                       while (lo < hi && num[hi] == num[hi-1]) hi--;
	                       lo++; hi--;
	                   } else if (num[lo] + num[hi]+ num[i] < 0) lo++;
	                   else hi--;
	              }
	           }
	       }
	       return res;
	}

	public static void main(String... args) {
		ThreeSum ts = new ThreeSum();
		int[] nums = { -2,0,0,2,2 };
		List<List<Integer>> ls = ts.threeSum(nums);
		for (List<Integer> list : ls) {
			System.out.println(Arrays.toString(list.toArray()));
		}
	}
}