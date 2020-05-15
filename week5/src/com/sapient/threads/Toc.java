package com.sapient.threads;

public class Toc extends Thread{
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Toc ");
			try {
				Thread.sleep(5);;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
