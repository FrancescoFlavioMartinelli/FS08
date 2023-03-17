package Teoria;

import java.util.Scanner;

public class Runnable {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("inserire a");
		String a = s.nextLine();
		int b = promptInt("Inserire b");
		s.nextLine(); // \n
		System.out.println("inserire c");
		String c = s.nextLine();
		//
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static int promptInt(String msg) {
		System.out.println(msg);
		int res = s.nextInt();
		s.nextLine();
		return res;
	}
	public static int promptIntPositivo(String msg) {
		int res = -1;
		while(res < 0) {			
			System.out.println(msg);
			res = s.nextInt();
			s.nextLine();
		}
		return res;
	}

}
