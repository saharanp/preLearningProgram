package com.sapient.threads;


public class TicTocRunner {

	public static void main(String[] args) {
		Tic tic = new Tic();
		tic.start();
		Toc tok = new Toc();
		tok.start();
		
	}

}

