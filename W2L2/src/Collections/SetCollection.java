package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		
		boolean added = s.add("A"); //add restituisce boolean se ha aggiunge o meno
		System.out.println(added + " A");
		
		added = s.add("B");
		System.out.println(added + " B");
		
		s.add("A");
		System.out.println(added + " A"); //nei set non ci possono essere duplicati, restiutirà false
		
		for(String elem : s) {
			System.out.println(elem);
		}
		

	}

}
