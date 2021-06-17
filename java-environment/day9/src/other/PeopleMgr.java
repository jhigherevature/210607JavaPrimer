package other;

public class PeopleMgr {
	public People[] allPeople;
	
	public void init() {
		allPeople = new People[4];
		
		People matt = new People("Matthew", 1);
		allPeople[0] = matt;
		People ahm = new People("Ahmed", 2);
		allPeople[1] = ahm;
		People an = new People("Andy", 3);
		allPeople[2] = an;
		People c = new People("Cao", 4);
		allPeople[3] = c;
		
		
	}
}
