package Lambda;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;

public class Teoria {

	public static void main(String[] args) {
		
		Runnable r = new Runnable() {

			@Override
			public void run() {
			}
			
		};
		
		Runnable r1 = ()->System.out.println("test");
		
		//
		
		FileFilter f = new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		FileFilter f1 = (File pathname) -> true;
		
		//
		
		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer arg0, Integer arg1) {
				return arg0 - arg1;
			}
		};
		
		Comparator<Integer> c1 = (Integer a0, Integer a1) -> a0-a1;
		
		
		runAfterAMinute(r1);
		
		//
		
		Callable<String> cl = new Callable<String>() {

			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
		
		Callable<String> cl1 = () -> "HELLO";
		
		//
		
		StringFunction sf = new StringFunction() {

			@Override
			public String execute(String s) {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
		
		StringFunction sf1 = (String s) -> s.toUpperCase().concat("!");
		
		
		test("ciao", (String s)-> s.toUpperCase().concat("!"));
		
		
		////FOREACH - REPLACEALL
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("a", 1);
		m.put("b", 2);
		m.put("c", 3);

//		BiConsumer<String, Boolean> b = (String s, Boolean b)->{};
		
		m.forEach((String k, Integer v)->{System.out.println(k + " - " + v);});
		m.replaceAll((String k, Integer v) -> v *  2);
		
//		GenericFuntion<String, Void> gf = (String s)-> {
//			return null;
//		};
		
		GenericFuntion<Integer, Double> media = (Integer... x) -> {
			Double res = 0d;
			for(Integer v : x) {
				res += v;
			}
			
			return res/x.length;
			};
			
			
			
			
			
			
			
		//////COMPLESSO
		GenericFuntion< GenericFuntion<Integer, Boolean> , Boolean> g = (GenericFuntion<Integer, Boolean>... p) -> {
					Boolean res = true;
					for(GenericFuntion<Integer, Boolean> gff : p) {
						Boolean b = gff.execute(1, 2, 3, 4);
						res = res && b;
					}
					return res;
				};
				
				GenericFuntion<Integer, Boolean> h = (Integer... i)-> {
					int res = 0;
					for(Integer j : i) {
						res += 1;
					}
					return res % 2 == 0;
				};
				
				
				GenericFuntion<Integer, Boolean> k = (Integer... i)-> {
					int res = 0;
					for(Integer j : i) {
						res += 1;
					}
					return res % 4 == 0;
				};
				
				
				g.execute(h, k);
				
				
				
				
				//REDUCE
				int[] x = {1, 2, 3, 4, 5};
//				int res = 0;
//				for(int n : x) {
//					res += n;
//				}
				
//				boolean tuttiPari = true;
//				for(int n : x) {
//					if(n % 2 != 0) tuttiPari = false;
//				}
				
				String pariDispari = "";
				for(int n : x) {
					if(n % 2 == 0) pariDispari += "P";
					else pariDispari += "D";
				}
				
				System.out.println(pariDispari);
				
				
				
	}
	
	
	public static String test(String a, StringFunction sf) {
		
		String res = sf.execute(a);
		
		return res;
		
	}
	
	public static void prova(GenericFuntion<ArrayList<String>, Boolean> f) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("A");
		a.add("B");
		a.add("C");
//		Boolean b = f.execute(a);
	}

	
	
	public static void runAfterAMinute(Runnable r) {
		try {
			Thread.sleep(60000);
			r.run();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
