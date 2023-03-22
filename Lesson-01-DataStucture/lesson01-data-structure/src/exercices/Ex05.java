package exercices;

import java.util.Arrays;

/**
 * Bài 4 (20đ): Cho mảng A gồm n phần tử (2 < n < 20). Ak = [0, 100] Viết hàm
 * liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong mảng. Kết quả trả về
 * được sắp xếp tăng dần.  Input: 3, 15, 21, 0, 15, 17, 21  Output: 0, 3, 17
 * Method signature: int[] getUniqueNumbers(....)
 * 
 * @author Oanhpv1008
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		
		String 

		int[] arr = { 3, 15, 21, 0, 15, 17, 21, 9, 10 };
		// index 0-6
		System.out.println(Arrays.toString(getUniqueNumbers(arr)));

	}
	// Phân biệt ++i và i++

	public static int[] getUniqueNumbers(int[] arr) {
		// b1 khởi tạo một mảng result = arr.length giá trị
		int[] result = new int[arr.length];
		// giá trị = 0, vì kdl int , default = 0
		System.out.println(Arrays.toString(result));

		// khởi tạo index của mảng result
		int index = 0;

		// Lặp tìm ra phần từ xuất hiện 1 lần
		for (int i = 0; i < arr.length; i++) {

			// khởi tạo biển count để đếm số phần từ trong mảng
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				// nếu phần từ xuất hiện thì count tăng lên 1
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			// nếu count = 1 => ptử chỉ xuất hiện 1 lần
			if (count == 1) {

				// gán result [index] = giá trị xuất hiện 1 lần là arr[i]
				result[index++] = arr[i];
			}
		}
		// loại bỏ những phần tử thừa
		return Arrays.copyOfRange(result, 0, index);
	}
}
