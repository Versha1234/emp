package com.stack;
 class demo {

	public int add() {
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println(c);
		return c;
		// TODO Auto-generated constructor stub
	}
	public static int sub() {
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println(c);
		return c;
	}
 }
public class employee{

	public static void main(String[] args) {
		demo obj=new demo();
		obj.add();
		obj.sub();
		// TODO Auto-generated method stub

	}

}
