package Ripasso;

public class Articolo {

	String codice;
	String descrizione;
	private double prezzo;
	int qnt = 10;
	
	static double iva;
	
	static int prodottiCreati = 0;
	
	//#1
	private Articolo() {
//		this.descrizione = "";
//		this.prezzo = 0;
//		this.qnt = 0;
		
		//qua mettiamo tutte le logiche che tutti i costruttori devono eseguire
		System.out.println("Prodotto creato");
		Articolo.prodottiCreati += 1;
		this.codice = this.generateCodice();
	}
	//#2
	public Articolo(String descrizione) {
		this();//#1
		this.descrizione = descrizione;
		this.prezzo = 0;
	}
	//#3
	public Articolo(String descrizione, double price) {
		this(descrizione);//#2
		this.prezzo = price + (price * Articolo.iva);
//		this.qnt = 10;
	}
	//#4
	public Articolo(String descrizione, double price, int qnt) {
		this(descrizione, price);//#3
		this.qnt = qnt;
	}
	
	
	

	//istanzia un nuovo oggetto di classe
//	public Articolo(String descrizione, double prezzo) {
//		//assegnare valori inziali
//		this.descrizione = descrizione;
//		this.prezzo = prezzo + (prezzo * iva);
////		this.qnt = 10;
//		//eseguire le logiche iniziali
//		Articolo.prodottiCreati += 1;
//		System.out.println("Prodotto creato");
//		this.codice = this.generateCodice();
////		this.codice = Articolo.generateCodice();
//	}
//	
	private String generateCodice() {
		String codice = "PR";
		codice += Articolo.prodottiCreati;
		codice += this.prezzo;
		
		return codice;
	}
	
//	static String generateCodice() {
//		String codice = "PR";
//		codice += Articolo.prodottiCreati;
//		
//		return codice;
//	}
	

	public static void impostaIva() {
		System.out.println("Inserire iva decimale");
		Articolo.iva = Runnable.scanner.nextDouble();
	}
	
	public static void impostaIva(double iva) {
		if(iva <= 1 && iva >= 0) {
			Articolo.iva = iva;
		}
	}
	public static void impostaIva(int iva) {
		iva = iva / 100;
		if(iva <= 1 && iva >= 0) {
			Articolo.iva = iva;
		}
	}
	
	
	public void setPrezzo(double p) {
		this.prezzo = p + (p * Articolo.iva);
	}
	
	public double getPrezzo() {
		return this.prezzo;
	}
	
	public String toString() {
		return "- " + this.codice + " -- " + this.getPrezzo() + "€\n";
	}
	
}
