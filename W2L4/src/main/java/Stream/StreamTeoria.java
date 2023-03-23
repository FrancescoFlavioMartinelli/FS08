package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTeoria {
	
	public static void main(String[] args)  {
		int[] start = {0, 1};
		//creao la stream
		List<Integer> l = Stream
			.iterate(start, n -> new int[] {n[1], n[0] + n[1]})
//			x = f(start)
//			y = f(x)
//			z = f(y) == f(f(f(start)))
			.limit(10)
			//modifico la stream
			.map(n -> n[0])
			//uso la stream
//			.forEach(n -> {System.out.println(n);}); //iterazione senza risultato
			.collect(Collectors.toList());
		
		
		
		System.out.println(l);
		
		
		
		////
		List<String> a = new ArrayList<String>();
		a.add("A");
		a.add("B");
		a.add("c");
		
		Predicate<String> p = x -> !x.equals("c");

		
		Stream<String> s = a.stream();//creo la stream a partire da list
		s = s.map(x -> x.toLowerCase()); //map - modifico i valori
		s = s.filter(p);
		
		//come concludere la pipeline
		//usiamo i dati
		s.forEach(x -> System.out.println(x));
		
		//raccogliamo i dati per dopo
		a = s.collect(Collectors.toList());
		
		
		a = a.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		a = a.stream().filter(x -> !x.equals("A")).collect(Collectors.toList());
		
		
		
		//REDUCE
		List<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		
		Integer res = li.stream().reduce(0, (tot, e) -> tot + e);
		
//		String res = li.stream().reduce("", (String tot, Integer e) -> {
//			if(e % 2 == 0) {
//				tot += "P";
//			}
//			else {
//				tot += "D";
//			}
//			return tot;
//		}, (String x1, String y1) -> {
//			//non viene eseguita in questo esempio
//			return x1;
//		});
		//qua usiamo l'overload a 3 paramtetri perchè permette di far restituire al reduce una tipologia diversa dagli elementi della stream
		
		System.out.println(res);
		
		
	}

}
