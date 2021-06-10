package scanner;

import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a number:");
		int input = scan.nextInt();
		System.out.println("Your number is: " + input);
		switch (input) {
		case 1:
			System.out.println("You chose option 1");
			menuOne();
			break;
		case 2:
			System.out.println("You chose option 2");
			break;
		}
	}
	
	public static void menuOne() {
		System.out.println("Menu 1 operations");
	}
}
