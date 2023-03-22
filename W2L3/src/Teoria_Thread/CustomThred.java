package Teoria_Thread;

public class CustomThred {
	
	Runnable r;
	
	public CustomThred(Runnable r) {
		this.r = r;
	}

	public CustomThred() {
		this.r = null;
	}
	
	public void start() {
		if(r != null) {			
			System.out.println("Avvio esecuizione del runnable");
			r.run();
		} else {
			this.run();
		}
	}
	
	public void run() {
		
	}

}
