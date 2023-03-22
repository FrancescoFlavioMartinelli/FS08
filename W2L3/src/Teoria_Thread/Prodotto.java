package Teoria_Thread;

public class Prodotto {
	
	int prezzo = 10;
	
	public Prodotto() {}
	
	public double prezzoConIva() {
		return prezzo + (prezzo * 0.24);
	}

}
