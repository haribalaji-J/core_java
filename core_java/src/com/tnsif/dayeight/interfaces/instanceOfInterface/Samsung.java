package com.tnsif.dayeight.interfaces.instanceOfInterface;

public class Samsung {
	public class Samsung implements Phone {
		@Override
		public void call() {
			System.out.println("Calling using Samsung");
		}

		@Override
		public void sms() {
			System.out.println("Messaging using Samsung");

		}

	}

}
