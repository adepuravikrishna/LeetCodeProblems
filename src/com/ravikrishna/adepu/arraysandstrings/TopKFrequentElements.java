package com.ravikrishna.adepu.arraysandstrings;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TopKFrequentElements {

	public static void main(String[] args) {
		int arr[] = {1,1,1,2,2,3};
		topKFrequent(arr,2);

	}

	public static List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer> list = new ArrayList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0; i<nums.length -1 ; i++) {
			pq.add(nums[i]);			
		}
		
		int curr = pq.poll();
		
		while(!pq.isEmpty()) {
			if(k!=0) {
				int temp = pq.poll();
				if(temp !=curr){
					k--;
					list.add(temp);
					curr = temp;
				}
			}
			if(k==0)
			break;
			
		}
		return list;

	}

}
