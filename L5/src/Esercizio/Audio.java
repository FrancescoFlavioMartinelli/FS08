package Esercizio;

public class Audio extends Multimedia implements ElementoRiproducibile {

	int durata;
	int volume;
	public Audio(String t, int d, int v) {
		super(t, ".mp3");
		this.durata = d;
		this.volume = v;
	}
	
	public void alzaVolume() {}
	public void abbassaVolume() {}
	
	public void play() {}
}
