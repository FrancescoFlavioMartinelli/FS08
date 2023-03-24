package Progetto;

import lombok.Data;

@Data
public class Libro extends Pubblicazione {
	
	
	private String autore;
	private Genere genere;
	
	public Libro(
			long ismb,
			int anno,
			String titolo,
			int pagine,
			Genere g,
			String autore
			) {
		super(ismb, titolo, anno, pagine);
		this.genere = g;
		this.autore = autore;
		
		
	}

}
