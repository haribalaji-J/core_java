package com.tnsif.dayeight.abstraction;

public class abstractdemo {

	public static void main(String[] args) {
		square sq=new square();
		rectangle r1=new rectangle();
		sq.calArea();
		sq.show();
		r1.calArea();
		r1.show();
		
		System.out.println("------------------------------------------------");
		//Runtime Polymorphism / Dynamic binding / late binding
		//Ex: Method Overriding
		
		shape shape;
		shape=new square(12.5f);
		
		shape.calArea(); // invoked Square class calArea()
		shape.show();
		
		shape=new rectangle(10,20);
		
		shape.calArea(); // invoked Rectangle class calArea()
		shape.show();
	}
}