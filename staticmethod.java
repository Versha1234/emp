package com.stack;
class Static{
	
	static int sub(int a, int b){
		return a-b;
	}
}

public class staticmethod {

	public static void main(String[] args) {
		System.out.println(Static.sub(40,20));
	}

}
