package Teoria;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Runnable {

	static Scanner s = new Scanner(System.in);
	
	private static final Logger l = LoggerFactory.getLogger(Runnable.class);
	
	public static Prodotto creaProdotto() throws Exception {
		System.out.println("Inserire nome prodotto");
		String n = s.nextLine();
		int q = askQnt();
//		
		Prodotto p;
		try {
			//operazioni con excpetion
			p = new Prodotto(n, q);
			//tutte le operazioni dui dati derivati dalla logica con excpetion devono essere gestiti dentro al try
//			System.out.println("Prodotto creato " + p );
			l.debug("Prodotto creato");
//			return p; //il return può essere fatto dopo, i throw nei cathimpediscono di raggiungerlo in caso di errore (attenzione a mettere throw in tutti i catch
		} catch (QuantitaException e) {
			System.out.println(e);
			l.error("INSERIRE QNT CORRETTA");
			throw e;
//			throw new Exception("Creazione prodotto fallita");
		} catch (ProdottoException e) {
			System.out.println(e);
			l.error("ERRORE CREAZIONE PRODOTTO");
			throw new Exception("Creazione prodotto fallita");
		} catch (Exception e) {
			//Exception cattura tutte le Exceptions di qualuqnue clase (essendo superclasse), bisogna metterlo dopo i catch scpecifici. Solo le exceptions non catturate arriveranno al fondo
			//Gestione errore
			System.out.println(e);
			throw e;
		}  finally {
			//operazioni da fare sempre indipendetemente dal termine del try o dall'invocazione del catch
			l.info("Finally");
			//ATTENZIONE ERRORE:  non mettere throw o return nel finally o avrai interazioni complicate da gestire.
			//throw new Exception("Creazione prodotto fallita");
		}
		return p;
//		System.out.println("FINE CREAZIONE");
	}
	
	
	//USO RICORSIVO DI CREAPRODOTTO (AVANZATO E SCONSIGLIATO)
//	public static Prodotto creaProdotto() {
//		System.out.println("Inserire nome prodotto");
//		String n = s.nextLine();
//		int q = askQnt();
////		
//		Prodotto p;
//		try {
//			//operazioni con excpetion
//			p = new Prodotto(n, q);
//			//tutte le operazioni dui dati derivati dalla logica con excpetion devono essere gestiti dentro al try
//			System.out.println("Prodotto creato " + p );
//		} catch (Exception e) {
//			//Gestione errore
//			System.out.println(e);
//			//in caso di errore si rifaà la funzione. Siccome il return avviene soltato quando try esegue correttamente questa assegnazioni del catch avverranno solo quando la creazione è riuscita
//			p = creaProdotto();
//		} finally {
//			//operazioni da fare sempre indipendetemente dal termine del try o dall'invocazione del catch
//			System.out.println("Finally");
//		}
//		return p;
//	}
	
	public static Prodotto creaProdottoPerpertually() {
		Prodotto p;
		while(true) {			
			try {
				p = creaProdotto();
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return p;
	}
	
	public static void main(String[] args) {
		
		//Prodotto p = creaProdotto();
		
		Prodotto p = creaProdottoPerpertually();
		
	
		
//ESEMPIO - Creazione prodotto while dati corretti
//		boolean success = false;
//		while(success == false) {
//			System.out.println("Inserire nome prodotto");
//			String n = s.nextLine();
//			int q = askQnt();
//			
//			Prodotto p;
//			try {
//				//operazioni con excpetion
//				p = new Prodotto(n, q);
//				//tutte le operazioni dui dati derivati dalla logica con excpetion devono essere gestiti dentro al try
//				System.out.println("Prodotto creato " + p );
//				success = true;
//			} catch (Exception e) {
//				//Gestione errore
//				System.out.println(e);
//				success = false;
//			} finally {
//				//operazioni da fare sempre indipendetemente dal termine del try o dall'invocazione del catch
//				System.out.println("Finally");
//			}
//			
//		}
//		System.out.println("CIAO");
		//il codice va avanti dopo il costrutto anche in caso di errore
		
///////////////////////////////////////////////////////////////////////////////////////
		
//		System.out.println("Inserire nome prodotto");
//		String n = s.nextLine();
////		int q = askQnt();
//		
//		
////		while(q == -173) {
////			q = askQnt();
////		}
//		
////		if(q == -173) {
////			System.out.println("Qnt non valida");
////		}
//		
////		if(q == -173) {
////			q = 0;
////		}
//		
////		while(true) {
////			int q = askQnt();			
////			try {			
////				Prodotto p = new Prodotto(n, q);
////				break;
////			} catch(Exception exc) {
////				System.out.println(exc);
////			}
////		}
//		
//
////		int q = askQnt();
////		try {
////			Prodotto p = new Prodotto(n, q);
////		} catch(Exception e) {
////			System.out.println("Qnt non valida");
////		}
//		
//		int q = askQnt();
////		try {
////			Prodotto p = new Prodotto(n, q);
////		} catch(Exception e) {
////			try {
////				Prodotto p = new Prodotto(n, 0);
////			} catch (Exception e1) {
////				// TODO Auto-generated catch block
////				e1.printStackTrace();
////			}
////		}
//		
//		try {
//			Prodotto p = new Prodotto(n, q);
//		} catch (Exception e) {
//			System.out.println("qweq");
//		}
//		
		System.out.println("END");
	}
	
	//se return negativo valore non accettato
	public static int askQnt() {
		System.out.println("Inserire qnt prodotto");			 
		int q = s.nextInt();
		s.nextLine();
//		if(q < 0 ) {
//			return -173; //valore qnt non accettabile, mando -1 per segnalare l'errore
//		}
		return q;
	}

}
