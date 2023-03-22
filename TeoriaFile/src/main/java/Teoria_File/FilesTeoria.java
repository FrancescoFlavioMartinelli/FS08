package Teoria_File;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FilesTeoria {
	
	public static void main(String[] args) {
		File f = new File("test.txt");
		//WRITE
//		try {
//			FileUtils.writeStringToFile(f, "TEST", "UTF-8");//sovrascrive
////			FileUtils.writeStringToFile(f, "1234", "UTF-8", false); //sovrascrive
//			FileUtils.writeStringToFile(f, "1234", "UTF-8", true); //append
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//READ
//		try {
//			String s = FileUtils.readFileToString(f, "UTF-8");
//			System.out.println(s);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//DELETE
//		FileUtils.deleteQuietly(f);
		
		//DELETE FOLDER
//		FileUtils.deleteDirectory("/test/"); //elimina la cartella test
	}
}
