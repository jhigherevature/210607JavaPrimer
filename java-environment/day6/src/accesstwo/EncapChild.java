package accesstwo;

import accessone.Encapsulation;

public class EncapChild extends Encapsulation {
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		System.out.println(e.pubStr);
		/*
		 * protected fields cannot be accessed directly from
		 * the parent class, even in the child class...
		 */
//		System.out.println(e.proStr);
	}
	
	public void accessProtected() {
		System.out.println(this.pubStr);
		/*
		 * You can access the protected field, as if it were
		 * written as a private field within this child class
		 */
		System.out.println(this.proStr);
	}
}
