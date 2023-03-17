package Esercizio;

public class Player {

	public static void main(String[] args) {
		Immagine i1 = new Immagine("img1", 10);
		Immagine i2 = new Immagine("img2", 20);
		Video v1 = new Video("video1", 5, 10, 20);
		Audio a1 = new Audio("audio1", 5, 10);
		
		Multimedia[] m = {v1, i2, i1, a1};
		
		if(m[0] instanceof Immagine) {
//			Immagine i = (Immagine) m[0];
//			i.show()
			
			( (Immagine) m[0] ).show();
		}
		
		ElementoVisibile[] imgs = {i1, i2, v1};
		((Immagine) imgs[0]).show();
	}

}
