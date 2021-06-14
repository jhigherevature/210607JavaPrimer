package accessone;

public class SimulatorOne {
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		System.out.println(e.pubStr);
		System.out.println(e.proStr);
		System.out.println(e.defStr);
		/*
		 * Private fields are only accessible within the class
		 * they are defined
		 */
//		System.out.println(e.priStr);
	}
}
