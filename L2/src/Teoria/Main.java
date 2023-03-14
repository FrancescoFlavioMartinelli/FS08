package Teoria;

//Classe da eseguire
public class Main {

	public static void main(String[] args) {
		Prodotto p1 = new Prodotto("Pantalone");
		Prodotto p2 = new Prodotto("Maglia", 20);
		p1.setPrice(10);
	
		p2.setPrice(30);
		
//		String[] x = {"Test", "20"};
//		p2.setInfo(x);
		
//		p1.setSale(.4);
//		p1.setSale(.3, true);
////		p1.price = 10;
////		p2.price = 30;
		System.out.println(p1.getNome());
		System.out.println(p2.getNome());
//		System.out.println(p1.getPrezzoScontato());
//		
//		System.out.println("Stai risparmiando " + p1.getRisparmio() );
		
		System.out.println(Prodotto.priceChanged);
//		System.out.println(p1.priceChanged);
//		System.out.println(p2.priceChanged);
		
//		Prodotto.getInfoProdotto();
		
	}

}
