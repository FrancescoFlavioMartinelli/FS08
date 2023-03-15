package Ripasso;

public class BetterArray {

	Articolo[] a = new Articolo [0];
	
	void push(Articolo a) {
		Articolo[] newArr = new Articolo [this.a.length + 1];
		for(int i = 0; i < this.a.length; i++) {
			newArr[i] = this.a[i];
		}
		
		newArr[newArr.length - 1] = a;
		this.a = newArr;
	}
	
	Articolo pop() {
		Articolo[] newArr = new Articolo [this.a.length - 1];
		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = this.a[i];
		}
		Articolo res = this.a[this.a.length - 1];
		this.a = newArr;
		return res;
	}
	
	int size() {
		return this.a.length;
	}
}
