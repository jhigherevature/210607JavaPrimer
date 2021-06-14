package scanner;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = -1;
		loop: while (input != 4) {
			
			System.out.println("Choose a new option");
			input = scan.nextInt();
			
			menu: switch (input) {
			case 1:
				System.out.println("You chose option 1");
				double value = scan.nextDouble();
				// calculate conversion and print...
				menuOne();
				break menu;
			case 2:
				System.out.println("You chose option 2");
				break menu;
			case 4:
				System.out.println("Thanks for using our system!");
				break loop;
			}
		}
	}

	public static void menuOne() {
		System.out.println("Menu 1 operations");
	}
}
