package com.ravikrishna.adepu.arraysandstrings;

import java.util.ArrayList;
import java.util.List;

// [[5,3,4],[1,0],[645,64]]

//[5,1,645,3,0,64,4]
//making changes

public class FlattenArray {
	
	public static void main(String[] args){
		
		int [][] arr = new int [][]{
			new int[]{3,2,4},
			new int[]{1},
			new int[]{5,6,7,8,9}
			};
		
	   List<Integer> ls = flattenArrayMatrix(arr);
		
	   for(Integer i:ls){
			System.out.println(i);
		}
	}



	private static List<Integer> flattenArrayMatrix(int[][] arr) {
		int totalRows = arr.length;
		List<Integer> ls = new ArrayList<Integer>();
		int maxCols = 0;
		for (int i =0 ; i<totalRows; i++) {
			if (arr[i].length > maxCols) {
				maxCols = arr[i].length;
			}
		}
		for (int j = 0; j<maxCols; j++) {
			for (int i = 0; i<totalRows; i++) {
				if (arr[i].length > j)
					ls.add(arr[i][j]) ;
			}
		}
		return ls;
	}

}
