package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {
	public static void main(String[] args) {
		File f = new File("files/example.txt");
		try {
			Scanner scan = new Scanner(f);
			
			System.out.println(scan.next());
			
			System.out.println(scan.nextInt());
			String restOfLine = scan.nextLine();
			System.out.println(restOfLine);
			
			while (scan.hasNext()) {
				System.out.print(scan.next() + " ");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
