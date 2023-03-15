package Ripasso;

import java.util.ArrayList;

public class Carrello {
	private Cliente c;
//	private Articolo[] articoli = new Articolo [0];
//	private BetterArray articoli = new BetterArray();
	private ArrayList<Articolo> articoli = new ArrayList();
//	private double totaleCostoArticoli = 30;
	
//	articoli[0].setPrezzo(20);
	
	private Carrello() {
		System.out.println("Nuovo carrello creato");
	}
	
	public Carrello(Cliente c) {
		this();
		this.c = c;
	}
	
	public void aggiungiArticolo(Articolo a) {
//		this.articoli.push(a);
		this.articoli.add(a);
//		a.qnt -= 1;
//		this.calcolaCostoArticolo();
	}
	
	double totalePrezzoArticoli() {
		double tot = 0;
		for(int i = 0; i < this.articoli.size(); i++) {
			tot += this.articoli.get(i).getPrezzo();
		}
//		this.totaleCostoArticoli = tot;
		return tot;
	}
	
	//viene usato automaticametne ogni volta che un oggetto di questa classe è usato come stringa
	public String toString() {
		String res = "Carrello:\n\n";
		res += "• Dati cliente: \n";
		res += this.c;
		res += "• Articoli:\n";
		for(int i = 0; i < this.articoli.size(); i++) {
			res += this.articoli.get(i);
		}
		res += "\n\nTotale: " +this.totalePrezzoArticoli();
		return res;
	}
}
