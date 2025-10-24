package com.tnsif.dayseven.Overriding.Covarient;

public class CovarientOverridingDemo {

	public static void main(String[] args) {
		throws CloneNotSupportedException
		{
			// new student object created
			Student student1 = new Student(1, "MCA", "Kapil");
			student1.printData();

			// Student object created using clone method
			// assuming type casting is required
			Student student2 = (Student) student1.clone();
			student2.printData();
			
		}
	}
}