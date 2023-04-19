package list;

import java.util.ArrayList;
import java.util.List;

import bean.People;

public class Ex01 {
	public static void main(String[] args) {
		
		// before java 5
		ArrayList<Object> arrList = new ArrayList<>();
		arrList.add(7);
		arrList.add("aaa");
		arrList.add(9);
		
	
		// after java 1.5
		// Generic type = Kiểu dữ liệu chung
		// catch error at compile
		ArrayList<Integer> arrList1 = new ArrayList<Integer>();
		arrList1.add(13);
		arrList1.add(29);
		arrList1.add(63);
		arrList1.add(1,16);
		
		printList(arrList1);
		
		arrList1.remove(0);
		arrList1.remove(new Integer(16));
		
		printList(arrList1);
		
		ArrayList<Integer> arrList2 = new ArrayList<Integer>();
		arrList2.add(10);
		
		arrList1.addAll(arrList2);
		
		printList(arrList1);
		
		boolean isContains = arrList1.contains(10);
		System.out.println(isContains);
		
		Integer index1 = arrList1.get(1);
		System.out.println(index1);
		
		for(int i = 0 ; i < arrList1.size() ;i ++) {
			System.out.print(arrList1.get(i) + " "); // arr[i]
		}
		System.out.println();
		
		arrList1.set(0, 1); // 29
		printList(arrList1);
	
	}
	
	private static void printList(List<Integer> list) {
		list.forEach(System.out::println);
		System.out.println("===============================");
	}
}
