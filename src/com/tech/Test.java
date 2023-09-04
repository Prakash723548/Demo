package com.tech;

public class Test {

	public static void main(String[] args) {
		Addition add1 = () -> {
			System.out.println("inside addition method");
		};
		add1.m1();

		System.out.println("-------------");
		Sub ss = (a, b) -> {
			System.out.println("substraction method");
			return a - b;
		};
		System.out.println(ss.sub(54, 25));
		System.out.println(ss.sub(50, 50));
		System.out.println("-------------");

		Multification multi = (a, b, c) -> {
			System.out.println(a * b * c);
		};
		multi.multi(10, 20, 30);

		System.out.println("-------------");
		Division dd = (x, y) -> {
			System.out.println("Division method");
			return x / y;
		};
		System.out.println(dd.division(25, 5));
		System.out.println("-------------");

		A ss1 = (fname, lname) -> {
			return fname +" "+ lname;
		};
		System.out.println(ss1.name("Prakash", "ASAMPOOR"));
		System.out.println(ss1.name("Fusion", "tech"));
		System.out.println("-------------");
		
		B bb = (fname, lname, age)->{
			System.out.println(fname + " "+lname );
			System.out.println("age of Man is >>"+age );
		};
		bb.details("Prakash", "Asampoor", 25);
		bb.details("A", "B", 25);
		
	}
}
