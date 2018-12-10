package com.ravikrishna.adepu.arraysandstrings;

import java.util.Arrays;

public class ProductOfArrayitself {

	public static void main(String[] args) {
		int [] nums = {1,2,3,4};
		int[] result = productExceptSelf(nums);
		System.out.println(Arrays.toString(result));

	}

	public static int[] productExceptSelf(int[] nums) {
		
		int[] result = new int[nums.length];
		int temp = nums[0];
		
		
		// calculate left product
		
		for(int i=0; i< nums.length; i++ ) {
			if(i == 0) {
			result[i] = 1;
			} else if (i == 1) {
				result[i] = temp;
			}else {
				result[i] = result[i-1] * nums[i-1];
				temp = result[i-1];
			}			
		
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(result));
		
		//calculate right product
		temp = nums[nums.length -1];
		
		for(int i= nums.length-1; i>=0; i--) {
			
		   if(i!= nums.length-1) {
			   result[i]*=temp;
			   temp = nums[i] * temp  ;

		   }
			
			
		}
		
		 
		 return result;

	}

}
