package Teoria_Files;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class Main {

	public static void main(String[] args) {
		
		File f = new File("test.txt");
		String s = FileUtils.readFileToString(f, "UTF-8");
		
		
	}

}
