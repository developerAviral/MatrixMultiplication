package com.indusface.app;

public class MatrixOperation {

	public int[][] matrixMultiplication(int arr1[][], int arr2[][]) {
		int c[][] = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 5; k++) {
					c[i][j] += arr1[i][k] * arr2[k][j];
				} // end of k loop
				System.out.print(c[i][j] + " "); // printing matrix element
			} // end of j loop
			System.out.println();// new line
		}
		
		return c;

	}
}
