package com.stack;

class emp {
	int rollNumber;
	String name;
	static String collegename="JECRC";

	public emp(int rollNumber,String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}
	void display()
	{
		System.out.println(rollNumber+ " " + name+ " " +collegename);
	}

}

public class Student
{
	public static void main(String[] args) {
		emp s1 = new emp(101,"Versha");
		emp s2 = new emp(102,"Aish");
		
		s1.display();
		s2.display();
}
}
