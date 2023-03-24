package Progetto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Biblioteca {
	
	private static List<Pubblicazione> catalogo = new ArrayList<Pubblicazione>();
	
	
	public static void main(String[] args) {
		
	}
	
	////
	private void aggiungiPubblicazione(Pubblicazione p) {
		catalogo.add(p);
	}
	
	public void aggiungi(Libro l) {
//		arrayLibri.add(l)
		aggiungiPubblicazione(l);
	}
	public void aggiungi(Rivista l) {
//		arrayRiviste.add(l)
		aggiungiPubblicazione(l);
	}
	
	public static List<Libro> catalogoLibri() {
		return catalogo.stream()
				.filter(e -> e instanceof Libro)
				.map(x -> (Libro) x)
				.collect(Collectors.toList());
	}
	public static Stream<Libro> catalogoLibriStream() {
		return (Stream<Libro>) catalogo.stream()
				.filter(e -> e instanceof Libro)
				.map(x -> (Libro) x);
	}
	
	
	public static void rimuovi(long isbn) {
		catalogo = catalogo.stream().filter(e -> e.getIsbn() != isbn).collect(Collectors.toList());
	}
	public static List<Libro> cercaPerAutore(String auto) {
//		return catalogo.stream()
//				.filter(e ->{
//					if(e instanceof Libro) {
//						return ((Libro)e).getAutore().equals(auto);
//					}
//					return false;
//				})
//				.map(e -> (Libro)e)
//				.collect(Collectors.toList());
		
		return catalogoLibri().stream().filter(e->e.getAutore().equals(auto)).collect(Collectors.toList());
//		return catalogoLibriStream().filter(e->e.getAutore().equals(auto)).collect(Collectors.toList());
	}

}
