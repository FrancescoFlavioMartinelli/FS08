package Esercizio2;

public class DividedByZeroException extends Exception {
	
	double km;

	public DividedByZeroException(double km) {
		super("Impossibile dividere per 0");
		this.km = km;
	}
}
