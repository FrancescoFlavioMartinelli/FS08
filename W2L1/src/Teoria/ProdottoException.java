package Teoria;

public class ProdottoException extends Exception {
	public ProdottoException(String msg) {
		super("Errore prodotto:\n" + msg);
	}
}
