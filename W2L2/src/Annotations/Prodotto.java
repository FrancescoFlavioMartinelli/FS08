package Annotations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Data 
//@Getter
//@Setter
@ToString
@AllArgsConstructor
public class Prodotto {
	
	@Getter @Setter
	private String nome;
	@Getter
	private double price;
	
	private String colore;
	
//	public Prodotto(String n, double p) {
//		this.nome = n;
//		this.price = p;
//	}
	
	public void calcolaPrezzo(int x) {
		
	}

}
