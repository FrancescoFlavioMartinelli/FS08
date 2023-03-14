package Esercitazione;

import java.util.Scanner;

public class Runnable {
	

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Sim s = new Sim(1235467890l);
		s.effettuaChiamata();
		s.effettuaChiamata();
		System.out.println(s);
	}

}
