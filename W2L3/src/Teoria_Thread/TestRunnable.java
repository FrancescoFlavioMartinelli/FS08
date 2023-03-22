package Teoria_Thread;

public class TestRunnable implements Runnable {

	String msg;
	int n;
	
	public static int counter = 0;
	
	public TestRunnable(String msg, int n) {
		this.msg = msg;
		this.n = n;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < this.n; i ++) {
			System.out.println(this.msg);
			counter++;
		}
		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		System.out.println(counter);
	}

}
