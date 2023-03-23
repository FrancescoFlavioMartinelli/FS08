package Esercizi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Cliente c1 = new Cliente(1, "c1", 2);
		Cliente c2 = new Cliente(2, "c2", 1);
		Cliente c3 = new Cliente(3, "c3", 1);
		
		Prodotto p1 = new Prodotto(1, "p1", "book", 15d);
		Prodotto p2 = new Prodotto(2, "p2", "boys", 12d);
		Prodotto p3 = new Prodotto(3, "p3", "baby", 13d);
		Prodotto p4 = new Prodotto(4, "p4", "boys", 14d);
		Prodotto p5 = new Prodotto(5, "p5", "book", 10d);
		
		List<Prodotto> pO1 = new ArrayList();
		pO1.add(p1);
		pO1.add(p2);
		pO1.add(p3);
		Ordine o1 = new Ordine(1, "s1", LocalDate.of(2021, 3, 12), LocalDate.of(2021, 3, 14), pO1, c1);
		
		List<Prodotto> pO2 = new ArrayList();
		pO2.add(p2);
		pO2.add(p1);
		pO2.add(p4);
		Ordine o2 = new Ordine(2, "s2", LocalDate.of(2021, 4, 20), LocalDate.of(2021, 4, 22), pO2, c2);
		
		List<Prodotto> pO3 = new ArrayList();
		pO3.add(p1);
		pO3.add(p5);
		Ordine o3 = new Ordine(3, "s3", LocalDate.of(2021, 9, 17), LocalDate.of(2021, 9, 19), pO3, c1);
		
		List<Ordine> ordini = new ArrayList<Ordine>();
		ordini.add(o1);
		ordini.add(o2);
		ordini.add(o3);
		
		
		///ESERCIZIO
//				List<Prodotto> l = ordini.stream()
//						//Stream<Ordine>
//						.map(o -> o.getProducts())
//						//così estraggo dalla stream di ordini le liste di prodotti (diventa Stream<List<Prodotto>>
//						.flatMap(p -> p.stream())
//						.filter(p -> p.getCategory().equals("book") && p.getPrice() > 100)
//						//così estraggo dalla stream di liste di prodotti Stream<Prodotto>
//						.collect(Collectors.toList());
				
				
		List<Prodotto> prodotti = new ArrayList<Prodotto>();
		for(Ordine o : ordini) {
			for(Prodotto p : o.getProducts()) {
				prodotti.add(p);
			}
		}
//		Stream.of(p1, p2, p3, p4, p5)
		List<Prodotto> prods = prodotti.stream().filter(p -> p.getCategory().equals("book") && p.getPrice() > 10)
		.distinct()
				.collect(Collectors.toList()); 
		
		System.out.println(prods);		
				
	}

}
