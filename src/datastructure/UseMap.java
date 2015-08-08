package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving
		 * elements. Use nested Map. Map<String, List<string>> list = new
		 * HAshMap<String, List<String>>(); Use For Each loop and while loop
		 * with Iterator to retrieve data.
		 * 
		 */

		// Create a hash map

		HashMap hashMap = new HashMap();

		hashMap.put("Zara", new Double(3434.34));
		hashMap.put("Mahnaz", new Double(123.22));
		hashMap.put("Ayan", new Double(1378.00));

		// Get a set of the entries
		Set set = hashMap.entrySet();
		// Get an iterator
		Iterator i = set.iterator();
		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		
		//sort by HashMapKey
		SortedSet<String> keys = new TreeSet<String>(hashMap.keySet());

		// Sorted List by hashmap values:
		SortedSet<String> values = new TreeSet<String>(hashMap.values());

		//nested map
		List<Map<String, List<String>>> maps = new ArrayList<Map<String, List<String>>>();
		Map<String, List<String>> map1 = new HashMap<String, List<String>>();
		List<String> arraylist1 = new ArrayList<String>();
		arraylist1.add("New York");// And so on..
		map1.put("Astoria", arraylist1);
		// And so on...
		maps.add(map1);

		System.out.println("Astoia in State: " + map1.get("Astoria"));

	}

}
