package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapArray {
	
	public static void main(String[] args) {
		//non poss
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		Set<String> keys = m.keySet(); //restituisce un set con tutte le keys della map
		
		m.put("test", 10);
		m.put("num", 0);
		Integer prev = m.put("num", 1);//sovrascirve la vecchia key
		if(prev == null ) {
			//non esisteva "num" prima
		} else {
			//esisteva già "num" e il vecchio valore è salvato in prev
		}
		
		if(!m.containsKey("num")) {
			//inserisco nuovo num
			m.put("num", 99);
		} else {
			//sovrascrivo num
			m.put("num", 99);
		}
		
		for(String k : keys) {
			
			System.out.println(m.get(k));
		}
	}

}
