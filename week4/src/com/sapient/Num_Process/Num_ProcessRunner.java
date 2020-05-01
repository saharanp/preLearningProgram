package com.sapient.Num_Process;

public class Num_ProcessRunner {

	public static void main(String[] args) {
		Num_Process[] operations = { new Add(), new Subtract(), new Multiply(), new Divide()};
		
		for(Num_Process opr : operations) {
			
			int ans = opr.cal(10,5);
			System.out.println(ans);
		}
	}
}
