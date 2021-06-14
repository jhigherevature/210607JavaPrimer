package scanner;

import java.util.InputMismatchException;


import java.util.Scanner;

public class InputStreamScanner {
	public static void main(String[] args) {
		System.out.println("FirstLine\nSecondLine");
		Scanner scan = new Scanner (System.in);
		
		String first = scan.next(); // reads the next "string" token
		int second = scan.nextInt(); // reads the next "int" token
		double third = scan.nextDouble(); // reads the next "double" token
		
		scan.close();
		System.out.println("Scanner has closed the stream");
//		String afterClosing = scan.next();
		Scanner otherScanner = new Scanner(System.in);
		String input = otherScanner.next();
	}
	
	public void example() {
		Scanner scan = new Scanner (System.in);
		try {
			int i = scan.nextInt();
			System.out.println("Your input was: " + i);
		} catch (InputMismatchException ime) {
			System.out.println("The input you entered was not a number");
			ime.printStackTrace();
		}
	}
}
