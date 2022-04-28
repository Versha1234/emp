package com.stack;

public class task{
	static int i=10;
	static int j=20;
	static int k;
	
	static{
		k=i*j;
	}
	
	public static void main(String[] args) {
		System.out.println(k);
	}
}

