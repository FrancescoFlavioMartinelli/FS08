package Progetto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract class Pubblicazione {
	private long isbn;
	private String titolo;
	private int anno;
	private int pagine;
	
	
	
}
