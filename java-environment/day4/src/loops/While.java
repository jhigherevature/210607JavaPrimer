package loops;

public class While {
	public static void main(String[] args) {
		int x = 6;
		while (x < 5) { 
			System.out.println("Start of While loop cycle");
			System.out.println(x);
			x++;
			System.out.println("End of While loop cycle");
		}
		
		int y = 10;
		do {
			System.out.println("Start of do-while loop cycle");
			System.out.println(y);
			y++;
			System.out.println("End of do-while loop cycle");
		} while (y < 5);
	}
}
