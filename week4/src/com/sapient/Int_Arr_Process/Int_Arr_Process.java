package com.sapient.Int_Arr_Process;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Int_Arr_Process {
	int n;
	List<Integer> array;
	
	public Int_Arr_Process() {         //default constructor
		n=10;
		array = new ArrayList<Integer>(n);
	}

	public Int_Arr_Process(int n) {      //constructor
		this.n=n;
		array = new ArrayList<Integer>(n);
	}

	public Int_Arr_Process(List<Integer> array) {       //constructor
		this.n = array.size();
		array = new ArrayList<Integer>(n);
		for(int i=0 ; i<n; i++) {
			this.array.add(array.get(i));
		}
	}

	Int_Arr_Process(Int_Arr_Process arr){            //copy constructor
		this.n = arr.n;
		for(int i=0 ; i<arr.n; i++) {
			this.array.add(arr.array.get(i));
		}		
	}

	public void readArray() {                        //read method
		for(int i=0; i<n; i++) {
			array.add(Read.rd.nextInt());
		}	
	}

	public void displayArrayHorizontally() {       //array display
		for(int i=0; i<n; i++) {
			System.out.print(array.get(i) + " ");
		}	
		System.out.println();
	}
	public void displayArrayVertically() {
		for(int i=0; i<n; i++) {
			System.out.println(array.get(i));
		}	
	}

	public void sortArray() {	                 //sort array
		Collections.sort(array);
	}

	public void biggestAndSmallestInArray() {	 
		System.out.println("Biggest number in the given array is " + Collections.max(array));
		System.out.println("Smallest number in the given array is " + Collections.min(array));
	}

	public void sumOfArray() {                // sum of elements
		int sum=0;
		for(int number : array) {
			sum+=number;
		}
		System.out.println("Sum of all the elements in the given Array is " + sum);
	}

	public void secondBiggestInArray() {         //
		int big = 0,secBig = 0;
		for(int number : array) {
			if(number>big) {
				big = number;	
			}
		}
		for(int number : array) {
			if(secBig<number && number<big) {
				secBig = number;
			}
		}
		System.out.println("Second Biggest element of the Array is " + secBig);
	}
	
	
}


