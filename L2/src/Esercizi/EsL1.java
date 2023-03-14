package Esercizi;

import java.util.Scanner;

public class EsL1 {

	static Scanner s = new Scanner(System.in);
	
	
	

	public static void main(String[] args) {
		int[] arr = leggiStringhe();
		stringheOrdinate(arr);
		
//Quando eseguo nextLine leggo l'input utente fino al primo \n
//Se eseguo nextInt() prima leggerò il valore intero inserito dall'utente ma potrbbe rimarere lo \n nel buffer, "prevenendo" il primo nextLine() successivo (che leggerà quello \n rimasto e non andrà oltre a leggere l'input utente
//Quindi possiamo usare nextLine() a vuoto dopo nextInt() per svuotare il buffer e poi chiedere all'utente un nuovo input
//		int x = s.nextInt();
//		s.nextLine(); //svuota \n dal buffer
//		System.out.println("Inserire stringa");
//		String y = s.nextLine();
//		
	}
	
	//Prende in input le 3 strighe e le restituise come array
	static int[] leggiStringhe() {
		int[] stringhe = new int[3];
		
		System.out.println("Inserire stringa 1");
		stringhe[0] = s.nextInt();
		System.out.println("Inserire stringa 2");
		stringhe[1] = s.nextInt();
		System.out.println("Inserire stringa 3");
		stringhe[2] = s.nextInt();
		return stringhe;
	}
	
	//chiede l'ordine all'utente e visualizza l'array
	static void stringheOrdinate(int[] a) {
		System.out.println("Selezionare l'ordine");
		Boolean order = s.nextBoolean();
		
		if(order) {
			for(int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}
		} else {			
			for(int i = a.length-1; i >= 0; i--) {
				System.out.print(a[i]+" ");
			}
		}
	} 

}
