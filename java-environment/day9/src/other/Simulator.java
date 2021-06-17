package other;

import generics.GenericClass;

public class Simulator {
	public static void main(String[] args) {
//		GenericClass<String> gcS = new GenericClass<String>("Revature");
		
		Platypus p = new Platypus("Perry", 5);
		System.out.println(p.getName());
		
//		GenericClass<Platypus> gcPRef = new GenericClass<Platypus>(p);
//		GenericClass<Platypus> gcPCon = new GenericClass<Platypus>(new Platypus("Patricia", 4));
		
		Zoo z = new Zoo();
		z.init();
		String input = "Portia";
		Platypus[] platys = z.getPlatypi();
		/*
		 * The method below looks through all of our Platypi objects
		 * for a platypus whose name matches our input...
		 */
		for (int i = 0; i < z.getPlatypi().length; i++) {
			if (platys[i].getName().intern() == input) {
				System.out.println(platys[i].getName());
			} 
		}
	}
}
