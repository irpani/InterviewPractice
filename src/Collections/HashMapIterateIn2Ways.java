package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIterateIn2Ways {

	public static void main(String[] args) {

		HashMap<String, Object> hm = new HashMap<String, Object>();

		hm.put("irfan", 1);
		hm.put("Abdulla", "9963650976");
		hm.put("Ashrifun", "1234");
		hm.put("Meharun", "786.03");

		System.out.println(hm);
		/*****
		 * Iteratr HashMap we can do in 2 Ways (1).Keyset (2)Entry Set
		 * 
		 */
		// ____Using KeySet()_____
		Iterator<String> it = hm.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			Object val = hm.get(key);
			System.out.println("Key=" + key + " " + "Value=" + val);
			// System.out.println(key + " " + val);

		}
		// ______Using EntrySet with Enhanced for loop Simple Way_____
		Set<Entry<String, Object>> it1 = hm.entrySet();

		for (Entry<String, Object> entry : it1) {
			System.out.println(entry);
		}
		// ______Using EntrySet with Iterator _____
		Iterator<Entry<String, Object>> it2 = hm.entrySet().iterator();
		while (it2.hasNext()) {
			Entry<String, Object> entry = it2.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
