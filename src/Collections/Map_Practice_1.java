package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Practice_1 {

	public static void main(String[] args) {

		/****
		 * Map(I) Methods ----- keySet() Values() get(Key)
		 * 
		 * Entry(I) Methods ----- EntrySet() getKey() getValue() setValue()
		 * 
		 * 
		 */

		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Irfan", 2);
		hm.put("Abdulla", 2);
		hm.put("Ashrifun", 2);
		hm.put("Meharun", 3);
		System.out.println("All the ELEMENTS in hashMap is");
		System.out.println(hm);
		System.out.println(hm.get("Irfan"));
		System.out.println("Values in the HashMap is" + hm.values());

		Set<String> set = hm.keySet();
		ArrayList<String> li = new ArrayList<String>(set);
		Iterator<String> it = li.iterator();
		System.out.println("------------------");
		System.out.println("Key Set Values in hashMAP");
		while (it.hasNext()) {
			String st = it.next();
			System.out.println(st);
		}
		System.out.println("------------------");

		// Iterate with Entry Set
		System.out.println("All the Entrys  in hashMap is ");
		Set<Entry<String, Integer>> entrySet = hm.entrySet();
		for (Entry<String, Integer> entry : entrySet) {

			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			// System.out.println(entry.setValue(1));
		}

	}

}
