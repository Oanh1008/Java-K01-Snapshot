package polymorphism;

public class Demo {
	public static void main(String[] args) {
		
		Employee employee = new Employee("name1", 10);
		System.out.println(employee);
		
		Employee employee2 = new Employee("name2", 11, "java core");
		System.out.println(employee2);
		System.out.println("===================================================");
		
		Profile profile = new Profile();
		
		employee.transfrome(); // QR code
		
		profile.transfrome(); // ipay
		
		System.out.println("===================================================");
		employee.learning(); // Employee is learning
		
		profile.learning(); // Profile is learning
		
		System.out.println("===================================================");
		
		employee.run();
		
		profile.run();
		
		
	}

}
