package Progetto;

public class Rivista extends Pubblicazione {

	private Periodicita periodicita;
	
	public Rivista(
			long ismb,
			int anno,
			String titolo,
			int pagine,
			Periodicita periodicita
			) {
		super(ismb, titolo, anno, pagine);
		this.periodicita = periodicita;
	}
}
