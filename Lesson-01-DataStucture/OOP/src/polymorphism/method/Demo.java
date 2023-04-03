package polymorphism.method;

import java.time.LocalDateTime;

public class Demo {

	public static void main(String[] args) {

		Calculate calculate = new Calculate();

		System.out.println(calculate.getMin(3, 5));

		System.out.println(calculate.getMin(3.4f, 5.3f));

		System.out.println(calculate.getMin(3, 4, 5));
		
		
		System.out.println(calculate.getMin(3,45,3,1,3,12,12,12));

		LocalDateTime localDateTime = LocalDateTime.of(2021, 12, 11, 9, 45, 45);

	}

}
