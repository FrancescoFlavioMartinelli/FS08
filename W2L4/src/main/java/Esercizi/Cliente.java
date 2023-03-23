package Esercizi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Cliente {
	
	private long id;
	private String nome;
	private int tier;
	
//	public Cliente(long id, String nome, int tier) {
//		this.id = id;
//		this.nome = nome;
//		this.tier = tier;
//	}

}
