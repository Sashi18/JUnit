package com.stackroute.demo;

import java.util.Scanner;

public class App1 {
	private int numb;
	public boolean setLimit(int a) {
		if(a <= 100 && a >= 1) {
			numb = a;
			return true;
		}
		else 
			return false;
	}
	
	public int getNumber() {
		return numb;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter initial number in range of 1 to 100");
		int n = sc.nextInt();
		System.out.println("Enter a guess in range 1 to 100");
		while(true) {
			int x = sc.nextInt();
			App1 ob = new App1();
			if(!ob.setLimit(x)) {
				sc.close();
				return;
			}
			if(x > n)
				System.out.println("Number guessed is more than original number");
			else if(x < n)
				System.out.println("Number guessed is less than original number");
			else if(x == n) {
				System.out.println("Number guessed is equal to original number");
				break;
			}
		}
		sc.close();
	}
}
