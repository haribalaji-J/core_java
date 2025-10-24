package com.tnsif.dayeight.interfaces.extendingInterfaces;

public class extendinginterfaceDemo {
	public class ExtendingInterfaceDemo implements ChildInterface {
		// Override ChildInterface method
		public void print() { 
			System.out.println("print method");
		}

		// Override InterfaceOne method
		public void show() {
			System.out.println("show Method");
		}
	}
}
