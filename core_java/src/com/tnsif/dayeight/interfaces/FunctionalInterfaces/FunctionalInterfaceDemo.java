package com.tnsif.dayeight.interfaces.FunctionalInterfaces;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		GreetClass g = new GreetClass();
		System.out.println(g.greet());

		//using Lambda Expression
		Greetlnterface g1 = () -> {
			return "Good Afternoon";
		};

		System.out.println(g1.greet());

	}

}
