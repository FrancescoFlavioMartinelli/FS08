package Esercizio;

public abstract class Multimedia {
	String title;
	String ext;
	
	public Multimedia() {}
	
	public Multimedia(String t, String e) {
		this.title = t;
		this.ext = e;
	}
	
	public abstract void test();
	
}
