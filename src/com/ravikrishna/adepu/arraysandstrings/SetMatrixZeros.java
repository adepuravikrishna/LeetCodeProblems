package com.ravikrishna.adepu.arraysandstrings;

public class SetMatrixZeros {
	public static void main(String... args) {
		int[][] arr = new int[][] { 
			
			  new int[] { 5, 3, 3, 8 }, 
			  new int[] { 14, 0, 7, 2 }, 
			  new int[] { 9, 6, 57, 12 }

		};

		setZeroes(arr);

	}

	public static void setZeroes(int[][] matrix) {
		
		 int col0 = 1, rows = matrix.length, cols = matrix[0].length;

		    for (int i = 0; i < rows; i++) {
		        if (matrix[i][0] == 0) col0 = 0;
		        for (int j = 1; j < cols; j++)
		            if (matrix[i][j] == 0)
		                matrix[i][0] = matrix[0][j] = 0;
		    }
		    
		   // System.out.println("mid");

		    for (int i = rows - 1; i >= 0; i--) {
		        for (int j = cols - 1; j >= 1; j--)
		            if (matrix[i][0] == 0 || matrix[0][j] == 0)
		                matrix[i][j] = 0;
		        if (col0 == 0) matrix[i][0] = 0;
		    }
		    
		   // System.out.println("mid");

	}
	
	
}
