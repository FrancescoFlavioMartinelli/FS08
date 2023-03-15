package Ripasso;

import java.util.Scanner;

public class Runnable {
	
	public static Scanner scanner = new Scanner(System.in);
	private Articolo a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Articolo.impostaIva(); 
//		Articolo.impostaIva(10); 
		//i prezzi usati in questo metodo sono senza iva
		Articolo a1 = new Articolo("descrizione 1", 10);
		Articolo a2 = new Articolo("descrizione 2", 20);
//		a1.prezzo = 10;
		
		Cliente c = new Cliente("Flavio", "Martinelli", "fm@mail.com");
		
		Carrello carr = new Carrello(c);
		carr.aggiungiArticolo(a1);
		carr.aggiungiArticolo(a2);
		
		System.out.println(carr); //passo come parametro string un oggetto
//		String output = "Carrelo: " + carr; //concateno String a oggetto come toString()
		
	}
	
	
	
}
