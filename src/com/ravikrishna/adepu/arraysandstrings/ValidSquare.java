package com.ravikrishna.adepu.arraysandstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ValidSquare {

	public static void main(String[] args) {
		//p1 = [0,0], p2 = [1,1], p3 = [1,0], p4 = [0,1]
		int[] p1 = {0,0}, p2={1,1},p3 ={1,0},p4= {0,1};
		
		System.out.println(validSquare(p1,p2,p3,p4));
		

	}
	 
	public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4){
		 
		 List<List<int[]>> nestedList = new ArrayList<>();
		 List<Integer> list = new ArrayList<>();
		 HashSet<Integer> hs = new HashSet<Integer>();
		 
		 nestedList.add(Arrays.asList(p1));
		 nestedList.add(Arrays.asList(p2));
		 nestedList.add(Arrays.asList(p3));
		 nestedList.add(Arrays.asList(p4));
		 
		 for(int i=0; i<nestedList.size(); i++){			 
			 for(int j=i+1; j<nestedList.size(); j++){		
				 System.out.println(i+"  "+ j);
				list.add(findDistance(nestedList.get(i),nestedList.get(j)));
				hs.add(findDistance(nestedList.get(i),nestedList.get(j)));			 
			 }			 
		 }
		 
		 int a_count=0,b_count=0 ,counter=0;
		 int [] arr = new int[2];
		 for(Integer i:hs){
			 arr[counter] = i;
		 }
		 
		 if(hs.size()==2){
			 
			 for(Integer k:list){
				if(arr[0] == k)
				a_count++;
				if(arr[1] == k)
				b_count++;
			 }
		 }
		 
		 if((a_count==4 && b_count==2)||(a_count==2 && b_count==4))
		 {
			 return true;
		 }
		 
		return false;
		 
	 }
	private static Integer findDistance(List<int[]> a, List<int[]> b) {
		int[] p = a.get(0);
		int[] q = b.get(0);		
		return (p[0]-q[0])*(p[0]-q[0]) + (p[1]-q[1])*(p[1]-q[1]);
	}

}
