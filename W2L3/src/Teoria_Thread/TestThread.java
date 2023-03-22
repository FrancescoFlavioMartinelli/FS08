package Teoria_Thread;

public class TestThread extends Thread {
	
	String msg;
	int n;
	
	public static int counter = 0;
	
	public TestThread(String msg, int n) {
		this.msg = msg;
		this.n = n;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < this.n; i ++) {
			System.out.println(this.msg);
			counter++;
		}
		System.out.println(counter);
	}

}
