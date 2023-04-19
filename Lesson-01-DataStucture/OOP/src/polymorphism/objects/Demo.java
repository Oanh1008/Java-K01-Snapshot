package polymorphism.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import polymorphism.method.Calculate;

public class Demo {
	public static void main(String[] args) {

		Employee employee = new Employee("o", "java");

		Profile profile = new Profile(22, "oa", "java spring");

		employee.learning();

		profile.transformer();

		System.out.println(employee.toString());
		System.out.println(profile.toString());

		System.out.println("================\n \n");

		App employee1 = new Employee("app1", "java");
		App profile1 = new Profile(22, "oaanh", "java core");

		System.out.println(employee1.toString());
		System.out.println(profile1.toString());

		System.out.println("================\n \n");
		employee1.learning();
		employee1.transformer();

		profile1.learning();
		profile1.transformer();

		System.out.println("================\n \n");
		employee1 = profile1;
		employee1.learning(); // Profile is learning

		// employee = profile // not work
		
		List<Integer> numbers = new ArrayList<>();
		
		 // Creating an empty ArrayList of string type
        ArrayList<String> mylist = new ArrayList<String>();
  
        // Adding custom input elements to list object
        mylist.add("code");
        mylist.add("quiz");
        mylist.add("geeksforgeeks");
        mylist.add("quiz");
        mylist.add("practice");
        mylist.add("qa");
  
        // Printing list before shuffling
        System.out.println("Original List : \n" + mylist);
  
        // Shuffling the list
        Collections.shuffle(mylist);
  
        // Printing list after shuffling
        System.out.println("\nShuffled List : \n" + mylist);

	}

}
