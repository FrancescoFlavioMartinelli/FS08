package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ES3 {
	
	public static void main(String args[]) {
		String arr[] = {"a", "b", "c", "d", "e"};
		
		String[] na = pushTerzo(arr, "F");
		
		System.out.println(na.toString());
//		for(int i = 0; i < na.length; i++) {
//			System.out.print(na[i] + ", ");
//		}

		System.out.println(Arrays.toString(na));
		
//		ArrayList<String> arr = new ArrayList<String>();
//		arr.add("test");
		
		
	}
	
	public static String[] pushTerzo(String[] a, String insert) {
		String[] newArr = new String[a.length + 1];
		for(int i = 0; i < newArr.length; i++) {
			if(i < 2) {
				newArr[i] = a[i];
			} else if(i == 2) {
				newArr[i] = insert;
			} else {				
				newArr[i] = a[i-1];
			}
			/*
			 * push
			if(i < newArr.length-1) {
				newArr[i] = a[i];
			} else {
				newArr[i] = insert;
			}*/
		}
		
		return newArr;
	}
	
}
