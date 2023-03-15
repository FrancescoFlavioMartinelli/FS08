package Ripasso;

import java.time.LocalDate;

public class Cliente {
	
	private String codice;
	private String nome;
	private String cognome;
	private String email;
	private LocalDate dataIscrizione;
	
	private Cliente() {
		System.out.println("Creazione cliente");
	}
	
	public Cliente(String nome, String cognome, String email) {
		this();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		
		this.dataIscrizione = LocalDate.now(); //restituisce LocalDate di ora
		this.codice = this.generaCodice();
	}
	
	private String generaCodice() {
		return this.nome + this.cognome + 123;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String n) {
		this.nome = n.toLowerCase();
	}
	
	public String getNomeCompleto() {
		return this.nome + " " + this.cognome;
	}
	
	public String toString() {
		return "- Nome completo: " + this.getNomeCompleto() +"\n\n";
	}

}
