package OOP;

public class TeoriaOOP {
	
	public static void main(String args[]) {
		Veicolo v = new Veicolo(5, 4);
//		v.setMarca(Marca.BMW);
		
		Automobile a = new Automobile(5, 5);
//		System.out.println(a.calcolaConsumo(10));
//		System.out.println(v.calcolaConsumo(10));
//		System.out.println(a.calcolaConsumoVeicolo(10));

		confrontaConsumi(a, v);
		
	}
	
	static public void confrontaConsumi(Veicolo v1, Veicolo v2) {
		String confronto = "più";
		System.out.println();
		if(v1 instanceof Automobile) {
			Automobile a1 = (Automobile) v1;
			test(a1);
			if(a1.calcolaConsumoVeicolo(10) < v2.calcolaConsumo(10)) {
				confronto = "meno";
			}
		} else {			
			if(v1.calcolaConsumo(10) < v2.calcolaConsumo(10)) {
				confronto = "meno";
			}
		}
		System.out.println("Il veicolo 1 consuma " + confronto + " del veicolo 2 :\n " + (v1.calcolaConsumo(10) - v2.calcolaConsumo(10)));
		
		
		test(v1);
	}
	
	static void test(MezzoDiTrasporto m) {
		m.calcolaConsumo(10);
		if(m instanceof Veicolo) {
			
			((Veicolo) m).setMarca(Marca.BMW);
		}
	}
}