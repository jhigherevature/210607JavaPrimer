package other;

public class Zoo {
	private Platypus[] platypi = new Platypus[4];
	
	public Zoo() {
		
	}
	
	public Zoo(int count) {
		platypi = new Platypus[count];
	}
	
	public void init() {
		Platypus p1 = new Platypus("Perry", 5);
		Platypus p2 = new Platypus("Patricia", 5);
		Platypus p3 = new Platypus("Peter", 5);
		Platypus p4 = new Platypus("Portia", 5);
		
		this.platypi[0] = p1;
		this.platypi[1] = p2;
		this.platypi[2] = p3;
		this.platypi[3] = p4;
		String word = "Hello";
		int strLng = word.length();
		
		for (int e = 0; e < platypi.length; e++) {
			System.out.println(platypi[e]);
		}
	}
	
	public Platypus[] getPlatypi() {
		return platypi;
	}
}
