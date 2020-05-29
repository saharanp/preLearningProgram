package com.sapient.calci;

public class calci {
	
	public static void main(String[] args) {
		calciInterface[] ob = {
				(a,b) -> {return a+b;},
				(a,b) -> {return a-b;},
				(a,b) -> {return a*b;},
				(a,b) -> {return a/b;}
			};
		
		int choice = read.rd.nextInt();
		while(choice!=-1) {
			System.out.println(ob[choice-1].calculate(5,10));
			choice = read.rd.nextInt();
		}

	}
	
}

