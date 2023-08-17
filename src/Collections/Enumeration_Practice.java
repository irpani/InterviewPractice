package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Practice {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();

		v.add("Apple");
		v.add("Mango");
		v.add("Orange");
		v.add("papaya");
		v.add("pineApple");

		System.out.println(v);
		// elements() which helps us itereae the Elements
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			// String str = (String) e.nextElement();
			String str = e.nextElement();
			System.out.println(str);
		}

	}

}
