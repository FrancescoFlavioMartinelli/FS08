package Esercitazione;

public class Sim {
	
//	String numero = "99999999999";
	long numero = 9999999999l;
	double credito = 0;
//	long[][] registroChiamate = new long[5][2];
	Chiamata[] registroChiamate = new Chiamata[5];
	

	public Sim(long n) {
		this.numero = n;
		this.credito = 5;
	}
	
	public void effettuaChiamata() {
		//creo la chiamata
		Chiamata c = new Chiamata();
		//le il prezzo della chiamata è minore del credito allora
		if(c.getPrezzo() <= credito) {
			//la chiamata è registrata
			aggiungiChiamataARegistro(c);
			//il costo è scalato
			this.credito -= c.getPrezzo();
			
			System.out.println("Chiamata effettuata!");
		} else {
			System.out.println("Chiamata fallita, credito insufficiente");
		}
	}
	
	private void aggiungiChiamataARegistro(Chiamata c) {
		for(int i = 1; i < registroChiamate.length; i++) {
			//sposto tutte le chiamate "in avanti"
			registroChiamate[i] =registroChiamate[i-1]; 
		}
		registroChiamate[0] = c;
	}
	
	
	//Il metodo toString è un metodo che restituisce una stringa che se definito in una classe verrà usato ogni volta che un'oggetto della classe si trova in un contesto di stringhe (nel println(), come parametro stringa, concatenato ad altre stringhe, ecc)
	public String toString() {
		String res = "• Numero: " + this.numero +
				"\n - credito residuo: " + this.credito +
				"\n - lista chiamate:" ;
		for(int i = 0; i < registroChiamate.length; i++) {
//			res += registroChiamate[i].toString();
			//non serve .toString() perchè la sto concatenando a una stringa
			res += registroChiamate[i];
		}
		return res;
	}
	
}
