package OOP;

public class Veicolo implements MezzoDiTrasporto {
	
	private Marca marca = Marca.NON_SPECIFICATO;
	int ruote;
	int consumo;
	
	public Veicolo(int consumo, int ruote) {
		this.consumo = consumo;
		this.ruote = ruote;
		
	}
	public Veicolo(int consumo, int ruote, Marca marca) {
		this.consumo = consumo;
		this.ruote = ruote;
		this.marca = marca;
	}
	
	public int getConsumo() {
		return this.consumo;
	}
	public double calcolaConsumo(int km) {
		return km * this.consumo;
	}
	
	public double calcolaConsumo(double ml) {
		return (float)(ml * 100 * this.consumo);
	}
	
	public void setMarca(Marca m) {
		this.marca = m;
//		boolean test = m.compareTo(Marca.BMW) == 0;
	}
	
}
