package Teoria;

public class Prodotto {
	
	String nome;
	int qnt;
	
	public Prodotto(String n, int q) throws Exception, QuantitaException {
		
//		if(q == -173) {
//			return false;
//		}
		
//		if( q < 0 ) {
//			q = 0;
//		}
		
		if(n == "" ) {
			throw new ProdottoException("Nome non valido");
		}
		
		if( q < 0 ) {
			throw new QuantitaException("valore negativo");
		}
		
		this.nome = n;
		this.qnt = q;
	}

}
