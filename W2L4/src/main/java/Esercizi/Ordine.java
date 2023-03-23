package Esercizi;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Ordine {
	
	private long id;
	private String status;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private List<Prodotto> products;
	private Cliente cliente;
	
//	public Ordine(long id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Prodotto> products, Cliente cliente){
//		this.id = id;
//		this.status = status;
//		this.orderDate = orderDate;
//		this.deliveryDate = deliveryDate;
//		this.products = products;
//		this.cliente = cliente;
//		
//	}

}
