package Teoria_Thread;

public class CustomThredExtends extends CustomThred {
	
	public CustomThredExtends() {
		super();
	}
	
	@Override
	public void run() {
		System.out.println("Thred custom running");
	}

}
