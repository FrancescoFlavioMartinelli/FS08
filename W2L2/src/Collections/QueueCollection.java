package Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollection {
	
	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<String>();
		//FIFO - first in first out
		q.add("A");
		q.add("B");
		q.add("C");
		
		String p = q.peek(); //osservo il prossimo elemento in uscita in coda
		System.out.println(p);
		
		String e = q.poll(); //estra il prossimo elemento in uscita in coda (rimuovendolo)
		System.out.println(e);
		
		for(String ele : q) {
			System.out.print(ele);
		}
		
		
	}

}
