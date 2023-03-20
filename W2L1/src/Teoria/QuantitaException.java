package Teoria;

import java.time.LocalDate;

public class QuantitaException extends ProdottoException {
	LocalDate date;
	public QuantitaException(String msg) {
		super("Quantità non valida - " + msg);
		this.date = LocalDate.now();
	}
}
