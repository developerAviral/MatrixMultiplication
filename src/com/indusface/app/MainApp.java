package com.indusface.app;

public class MainApp {
	
	public static void main(String[] args) {
		int arr1[][] = {
				{12, 30, 15, 18, 19},
				{22, 65, 9, 10, 27},
				{15, 12, 99, 100, 25},
				{52, 32, 45, 78, 85},
				{6, 61, 74, 92, 05}
		};
		int arr2[][] = {
				{234, 28, 12, 43 , 33},
				{43, 233, 212, 51, 632},
				{1283, 4734, 878, 987, 4445},
				{453, 4578, 234, 34, 56},
				{978, 775, 523, 77, 127}
		};
		
		MatrixOperation matrixOper = new MatrixOperation();
		int result[][] = matrixOper.matrixMultiplication(arr1, arr2);
	}
}
