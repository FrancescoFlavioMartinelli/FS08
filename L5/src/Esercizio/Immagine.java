package Esercizio;

public class Immagine extends Multimedia implements ElementoVisibile {

	int luminosita;
	
	public Immagine(String t, int l) {
		super(t, ".png");
		this.luminosita = l;
	}
	
	void alzaLum() {}
	void abbassaLum() {}
	
	void show() {}

}
