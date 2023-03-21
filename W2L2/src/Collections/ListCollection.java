package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
	
	public static void main (String[] args) {
		List<String> l = new ArrayList<String>();
		
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("A");
		
	
		for(int i = 0; i < l.size(); i++) {
			String elemn = l.get(i);
		}
		
		for(String a : l) {
			
		}
		
	}
	
}
