package com.stackroute.demo;

import java.util.*;

public class App {
	public boolean isSum(int a) {
		if(a > 15)
			return true;
		return false;
	}
	
	public int sumEven(int n) {
		int sum = 0;
		while(n != 0) {
			int x = n%10;
			if(x%2 == 0)
				sum += x;
			n /= 10;
		}
		return sum;
	}
	
	public int sorting(int n) {
		Vector<Integer> v = new Vector<Integer>();
		while(n != 0) {
			v.add(n%10);
			n /= 10;
		}
		Collections.sort(v, Collections.reverseOrder());
		n = 0;
		Iterator<Integer> itr = v.iterator();
		while(itr.hasNext()) {
			n = n*10 + itr.next();
		}
		return n;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		App ob = new App();
		System.out.println("Sorted number in non-incresing order: "+ob.sorting(n));
		System.out.println("Sum of even numbers: "+ob.sumEven(n));
		System.out.println(ob.isSum(ob.sumEven(n)));
	}
}
