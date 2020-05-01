package com.sapient.Matrix;

public class Matrix {
	
	int a;
	int b;
	int matrix[][]; 
		
	public Matrix() {      //constructor
		a = 3;
		b = 3;
		matrix = new int[a][b];
	}
	
	public Matrix(int i, int j) {

		a = i;
		b = j;
		matrix = new int[a][b];
	}
	
	public Matrix(int[][] M) {
		a = M.length;
		b= M[0].length;
		this.matrix = new int[a][b];
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				this.matrix[i][j] = M[i][j];
			}
		}
	}

	
	Matrix(Matrix M){
		this.a = M.a;
		this.b = M.b;
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				this.matrix[i][j] = M.matrix[i][j];
			}
		}
	}
	
	
	public void readMatrix() {
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				this.matrix[i][j] = Read.rd.nextInt();
			}
		}
	}

	public void displayMatrix() {
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				System.out.print(this.matrix[i][j] + " ");
			}
			System.out.println();
		}	
	}

	public Matrix addMatrix(Matrix M) {
		
		Matrix result = new Matrix(a,b);
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				result.matrix[i][j] = this.matrix[i][j] + M.matrix[i][j];
			}
		}
		return result;
	}


	public void checkIfScalar() {
		Boolean isScalar = true;
		int x = this.matrix[0][0];
		for(int i=0; i<a; i++) {
			
			if(this.matrix[i][i] != x) {
				isScalar = false;
			}
			for(int j=0; j<b; j++) {
				if(i!=j && this.matrix[i][j] != 0) {
					isScalar = false;	
				}
			}
		}
		
		 if(isScalar) {
			 System.out.println("this matrix is scalar ");
		 }
		 else {
			 System.out.println("this matrix is not scalar");
		 }
	}
	
	public Matrix multiplyMatrix(Matrix M) {
		
		Matrix result = new Matrix(a,M.b);
		for(int i=0; i<a; i++) {
			for(int j=0; j<M.b; j++) {
				for(int k=0; k<b; k++) {
					result.matrix[i][j] += this.matrix[i][k] * M.matrix[k][j];
				}
			}
		}
		return result;
	}
	
}
