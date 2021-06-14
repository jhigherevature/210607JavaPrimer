package accesstwo;

import accessone.Encapsulation;

public class SimulatorTwo {
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		/*
		 * Public means we can access the data from any class in
		 * our project
		 */
		System.out.println(e.pubStr);
		
		/*
		 * The Protected access modifier allows you to access information
		 * that exists in a class within the same package OR within a
		 * subclass of a parent, even if the parent is in another package
		 */
//		System.out.println(e.proStr);
		
		/*
		 * The Default access modifier allows you to access information
		 * that exists in a class within the same package. 
		 */
//		System.out.println(e.defStr);
	}
}
