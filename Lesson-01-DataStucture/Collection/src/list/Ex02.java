package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		ArrayList<Integer> arrList2 = new ArrayList<Integer>(); // dynamic : động
		// => gon hon
		ArrayList<Integer> arrList3 = new ArrayList<>();
		
		List<Integer> linkList = new LinkedList<Integer>();
		// toi uu
		List<Integer> arrList4 = new ArrayList<>();
		
		arrList4 = linkList;
	}
}
