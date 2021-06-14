package accessone;

public class Simulator {
	public static void main(String[] args) {
		Example e1 = new Example();
		Example e2 = new Example();
		
		/*
		 * Non-static fields exist in isolation across the objects
		 * created from a class
		 */
		e1.setName("Example One");
		e2.setName("Example Two");
		System.out.println(e1.getName());
		System.out.println(e2.getName());
		
		/*
		 * Static fields are shared across all instances of a class
		 */
		e1.setWord("Revature");
		e2.setWord("Programming");
		System.out.println(e1.getWord());
		System.out.println(e2.getWord());
		
		System.out.println(e1);
		System.out.println(e2);
	}
}
