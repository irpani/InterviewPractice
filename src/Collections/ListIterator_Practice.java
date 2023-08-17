package Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterator_Practice {

	public static void main(String[] args) {

		LinkedList<String> li = new LinkedList<String>();
		li.add("SACHIN");
		li.add("DHONI");
		li.add("GANGULY");
		li.add("DRAVID");
		li.add("LAXMAN");
		System.out.println(li);

		ListIterator<String> lit = li.listIterator();
		System.out.println("Iterate the Elements using List Iterator");
		while (lit.hasNext()) {

			String str = lit.next();
			System.out.println(str);
		}
	}

}
