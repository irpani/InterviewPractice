package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPractice_1 {

	public static void main(String[] args) {

		List<String> li = new ArrayList<String>();
		li.add("One");
		li.add("Two");
		li.add("Three");
		li.add("Four");
		li.add("Five");
		li.add("Six");
		li.add("Seven");
		li.add("Eight");
		li.add("Nine");
		li.add("Ten");

		System.out.println(li);
		// forloop
		for (int i = 0; i < li.size(); i++) {

			if (li.get(i).equals("Six")) {
				System.out.println("Match the Condition");

			}

		}

		System.out.println("==========================");
		System.out.println("Iterate with foreach loop");
		// for-each loop
		for (String string : li) {
			System.out.println(string);
		}

		System.out.println("==========================");
		System.out.println("Retrieve with the Iterator");

		// Iterator
		Iterator<String> it = li.iterator();

		while (it.hasNext()) {

			String str = it.next();
			System.out.println(str);

		}

		System.out.println("==========================");
		System.out.println("Retrieve with the list Iterator");

	}

}
