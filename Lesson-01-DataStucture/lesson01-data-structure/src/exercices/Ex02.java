package exercices;

import java.math.BigInteger;
import java.util.Scanner;


public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bài 2: Viết chương trình tính tổng S = 4! +7! + 12! + 18!
		Scanner sc = new Scanner(System.in);

		int[] arr = {4};

		long sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += factorial(arr[i]);
		}
		
		System.out.println(sum);

	}

	// hàm giai thừa
	// Khai báo n
	public static int factorial(int number) {
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result = result * i;
		}
		return result;
	}
}
