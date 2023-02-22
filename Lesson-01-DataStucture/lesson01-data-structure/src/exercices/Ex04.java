package exercices;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		// kiểm tra số nhập vào phải là số đối xứng k : vd 12221 là số đổi xứng
		// 123321 , 1111, 51215, 452252

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int number = sc.nextInt();

		System.out.println(isOppositeNumber(number));

	}

	public static boolean isOppositeNumber(int number) {
		// 123321 -> array
		String strNumber = String.valueOf(number);

		for (int i = 0; i < strNumber.length(); i++) {
			if (strNumber.charAt(i) != strNumber.charAt(strNumber.length() - 1 - i)) {
				return false;
			}
		}

//		// "123321"
//		int[] numbers = new int[strNumber.length()];
//		for (int i = strNumber.length() - 1; i >= 0; i--) {
//			numbers[i] = number % 10;
//			number /= 10;
//		}
//		for (int i = 0; i < strNumber.length() / 2; i++) {
//			if (numbers[i] != numbers[strNumber.length() - 1 - i]) {
//				return false;
//			}
//		}
		return true;
	}

}
