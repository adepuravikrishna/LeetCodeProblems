package com.ravikrishna.adepu.arraysandstrings;

public class MedianOfSortedArrays {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2 };
		int[] arr2 = { 3 };
		findMedianSortedArrays(arr1, arr2);

	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		if (nums1.length > nums2.length)
			return findMedianSortedArrays(nums2, nums1);
		int x = nums1.length, y = nums2.length;
		int low = 0, high = x;
		
		while (low <= high) {
			int partX = low + high / 2;
			int partY = (x + y + 1) / 2 - partX;

			int maxLeftX = (partX == 0) ? Integer.MIN_VALUE : nums1[partX - 1];
			int minRightX = (partX == x) ? Integer.MAX_VALUE : nums1[partX];

			int maxLeftY = (partY == 0) ? Integer.MIN_VALUE : nums2[partY - 1];
			int minRightY = (partY == y) ? Integer.MAX_VALUE : nums2[partY];

			if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
				// mil gaya
				 if ((x + y) % 2 == 0) {
	                    return ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY))/2;
	                } else {
	                    return (double)Math.max(maxLeftX, maxLeftY);
	                }

			} else if (maxLeftX > minRightY) { // move to X partition to left yaar

				high = partX - 1;

			} else {

				low = partX + 1;

			}

		}

		return -1;
	}
	
	public double findMedianSortedArrays1ß(int input1[], int input2[]) {
        //if input1 length is greater than switch them so that input1 is smaller than input2.
        if (input1.length > input2.length) {
            return findMedianSortedArrays(input2, input1);
        }
        int x = input1.length;
        int y = input2.length;

        int low = 0;
        int high = x;
        while (low <= high) {
            int partitionX = (low + high)/2;
            int partitionY = (x + y + 1)/2 - partitionX;

            //if partitionX is 0 it means nothing is there on left side. Use -INF for maxLeftX
            //if partitionX is length of input then there is nothing on right side. Use +INF for minRightX
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : input1[partitionX - 1];
            int minRightX = (partitionX == x) ? Integer.MAX_VALUE : input1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : input2[partitionY - 1];
            int minRightY = (partitionY == y) ? Integer.MAX_VALUE : input2[partitionY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                //We have partitioned array at correct place
                // Now get max of left elements and min of right elements to get the median in case of even length combined array size
                // or get max of left for odd length combined array size.
                if ((x + y) % 2 == 0) {
                    return ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY))/2;
                } else {
                    return (double)Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) { //we are too far on right side for partitionX. Go on left side.
                high = partitionX - 1;
            } else { //we are too far on left side for partitionX. Go on right side.
                low = partitionX + 1;
            }
        }

        //Only we we can come here is if input arrays were not sorted. Throw in that scenario.
        throw new IllegalArgumentException();
    }

}
