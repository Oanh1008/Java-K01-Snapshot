package demo;

import java.util.Scanner;

import exercices.Ex01;

public class App {
	public static void main(String[] args) {
		
		final String MY_NAME = "Pham Van Oanh";
		
		// Lớp nhâp
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your year's birthday : ");

		// ln = line

		int year = sc.nextInt();

		int age = 2023 - year;

		System.out.println("Your age is: " + age);
		
		boolean ok = 20 > 30 ? true: false;
		
		System.out.println(ok);
		
		
		// Camel naming convention = lạc đà
		
		int YourAge; //1
		int yourAge; //2
		int yourage; //3
		
		// Hằng số  = constant
		
		
		for (int i = 1 ;i <=19 ;i++) {
			System.out.println(i);
		}
		
		
		Ex01 ex01 = new Ex01();
		
	}

	// main crtl + space
	// format code : crtl shift F
	
	// Toán tử ba ngôi
	
	
}
