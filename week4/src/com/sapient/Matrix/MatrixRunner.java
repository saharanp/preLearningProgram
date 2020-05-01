package com.sapient.Matrix;

public class MatrixRunner {

	public static void main(String[] args) {
		
		 Matrix obj1 = new Matrix(3,3);
		 
		 obj1.readMatrix();
		 obj1.displayMatrix();
		 
		 int matrix[][] = new int[3][3];

		 for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				matrix[i][j] = 1;
			}
		 }

		 Matrix obj2 = new Matrix(matrix);
		 obj2.displayMatrix();
		 
		 Matrix obj3 = obj1.addMatrix(obj2);
		 obj3.displayMatrix();
		 
		 Matrix m4 = obj1.multiplyMatrix(obj2);
		 m4.displayMatrix();
		
	}

}
