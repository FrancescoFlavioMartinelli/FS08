package Esercizi;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor //crea il costruttore con tutte le proprietà come parametri
@Getter //crea i metodi get di ogni proprietà
@ToString
public class Prodotto {
	
	private long id;
	private String name;
	@Setter
	private String category;
	private double price;
	
//	public Prodotto(long id, String name, String cat, double price) {
//		this.id = id;
//		this.name = name;
//		this.category = cat;
//		this.price = price;
//	}
//	
//	public String getName() {
//		return this.name;
//	}
	
	

}
