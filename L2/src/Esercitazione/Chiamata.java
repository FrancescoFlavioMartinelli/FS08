package Esercitazione;

public class Chiamata {
	
	long id;
	
	static long currentId = 0;
	
	long numeroChiamato;
	double durata;
	
	private double costoAlMinuto = 0.1d;
	
	public Chiamata() {
		this.id = Chiamata.currentId;
		Chiamata.currentId += 1;
	}
	
	public Chiamata(long n, double d) {
//		this.id = (long) Math.random() * 1000000000l ;
		this();
		this.numeroChiamato = n;
		this.durata = d;
	}

	public Chiamata(boolean b) {
		this();
		System.out.println("Inserire il numero chiamato");
		this.numeroChiamato = Runnable.scanner.nextLong();
		System.out.println("Inserire durata chiamata");
		this.durata = Runnable.scanner.nextDouble();
	}
	
	
//	static Chiamata creaChiamata() {
//		System.out.println("Inserire il numero chiamato");
//		long numeroChiamato = Runnable.scanner.nextLong();
//		System.out.println("Inserire durata chiamata");
//		double durata = Runnable.scanner.nextDouble();
//		return new Chiamata(numeroChiamato, durata);
//	}
	
	public double getPrezzo() {
		return costoAlMinuto * durata;
	}
	
	
	public String toString() {
		return "\nCHIAMATA#"+this.id+"\ndest:"+this.numeroChiamato+"\ndurata:"+this.durata+"\ncosto totale: " + this.getPrezzo();
	}

}
