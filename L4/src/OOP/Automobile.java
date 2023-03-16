package OOP;

public class Automobile extends Veicolo {
//	private Marca marca = Marca.NON_SPECIFICATO;
//	int ruote;
//	int consumo;

	int porte;
	
	public Automobile(int consumo, int porte) {
		super(consumo, 4);
//		this.ruote = 4;
		this.porte = porte;
	}
	
	public Automobile(int consumo) {
		this(consumo, 5);
//		super(consumo, 4);
////		this.ruote = 4;
//		this.porte = 5;
	}
	
	public void apriPorte() {
		for(int i = 0; i < this.porte; i++) {
			System.out.println("Aperta porta "  + i );
		}
	}
	
	//override
	public double calcolaConsumo(int km) {
//		return km * this.consumo * 0.15381538;
		return super.calcolaConsumo(km) * 0.15381538;
	}
	
	public double calcolaConsumo(double ml) {
		return this.calcolaConsumo(ml*100); 
	}
	
	public float calcolaConsumo(float f) {
		return f * 1000 * this.consumo * 0.15381538f; 
	}
	
	public double calcolaConsumoVeicolo(int km) {
		return super.calcolaConsumo(km);
	}
//	
//	public double calcolaConsumoVeicolo(int km) {
//		return super.calcolaConsumo(km);
//	}
//	public double calcolaConsumoAutomobile(int km) {
//		return km * this.consumo * 0.15381538; 
//	}
//	
	public double differenzaConsumoMedio() {
		double consumo = this.calcolaConsumo(10);
		double consumoMedio = super.calcolaConsumo(10);
		return consumo - consumoMedio;
	}
	
	

//	public void setMarca(Marca m) {
//		this.marca = m;
////		boolean test = m.compareTo(Marca.BMW) == 0;
//	}
}
