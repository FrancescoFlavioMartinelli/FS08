package Teoria_Thread;

public class Main {

	public static void main(String[] args) {
		//THREAD
//		TestThread t1 = new TestThread("T1", 5);
//		TestThread t2 = new TestThread("T2", 20);
//		
		
		//RUNNABLE
		TestRunnable r1 = new TestRunnable("R1", 20);
		TestRunnable r2 = new TestRunnable("R2", 20);
//		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
//		
//		
//		//AVVIO I THREAD
//		
		t1.start(); //esegue run asincronamente (crea esecuzione parallela, imposta states, ...,  esegue run())
		t2.start();
		
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		
		
		
		try {
			t1.join();
			t2.join();
			System.out.println(TestRunnable.counter);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("END");
		
		//SOLO PER SPIEGAZIONE - NON FA NULLA DI RILEVANTE
//		CustomThred t = new CustomThred(r1);
//		CustomThredExtends t = new CustomThredExtends();
//		t.start();
	}

}
