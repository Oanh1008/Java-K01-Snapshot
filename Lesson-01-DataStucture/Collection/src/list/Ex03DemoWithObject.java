package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Item;

public class Ex03DemoWithObject {
	public static void main(String[] args) {
		
		List<Item> items = getItems();
		
		items.forEach(System.out::println);
		
		System.out.println("Size of items : "+ items.size());
		
		System.out.println("=======================================");
		items.remove(new Item(1, "item1"));
		
		items.forEach(System.out::println);
	}
	
	private static List<Item> getItems() {
		List<Item> items = new ArrayList<Item>();
		Item item1 = new Item(1,"item1");
		
		items.add(item1);
		items.add(new Item(2, "item2"));
		items.add(new Item(3, "item3"));
		items.add(new Item(4, "item4"));
		items.add(new Item(5, "item5"));
		return items;
	}
}
