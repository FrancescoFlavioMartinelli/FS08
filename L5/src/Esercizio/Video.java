package Esercizio;

public class Video extends Multimedia implements ElementoRiproducibile, ElementoVisibile {
	
	int durata;
	int volume;
	int luminosita;
	
	public Video(String t, int d, int v, int l) {
		super(t, ".mp4");
		this.durata = d;
		this.volume = v;
		this.luminosita = l;
	}
	
	void alzaVolume() {}
	void abbassaVolume() {}
	
	void alzaLum() {}
	void abbassaLum() {}
	
	void play() {}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	
}
