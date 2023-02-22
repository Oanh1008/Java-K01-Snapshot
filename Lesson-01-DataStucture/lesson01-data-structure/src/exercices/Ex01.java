package exercices;

import java.util.Scanner;

public class Ex01 {
	
	protected int color;
	
	public static void main(String[] args) {
		// Bài 1: Viết chương trình kiểm tra 1 số có phải là lũy thừa của 2 hay không

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number = sc.nextInt();
		System.out.println(isPowerOfTwo(number));

	}

	// cách 1
	public static boolean isPowerOfTwo(int number) { // number = 8

		if (number < 2) { // is power of 2 , must greater than 2
			return false;
		} else {
			while (number > 1) {
				int temp = number % 2; // chia lấy phần dư 9 % 2 = 1
				// những số % cho 2 != 0 -> số lẻ <- không phải là lũy thừa của số 2
				if (temp != 0) {
					return false;
				}
				number =  number / 2;   
			}
		}

		return true;
	}

}
