package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		List<String> x = new ArrayList<String>();
//		Set<String> x = new HashSet<String>();
//		Queue<String> x = new PriorityQueue< String>();
		x.add("A");
		x.add("B");
		
		
		Iterator i = x.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

		x.clear();
	}

}
