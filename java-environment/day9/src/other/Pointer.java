package other;

public class Pointer {
	People target;
	
	public People getTarget() {
		return target;
	}
	
	/*
	 * Delcaring the method
	 */
	public void setTarget(People target) {
		this.target = target;
	}
	
	static PeopleMgr pm = new PeopleMgr();
	public static void main(String[] args) {
		Pointer pnt = new Pointer();
		pm.init();
		
		pnt.setTarget(pm.allPeople[0]);
		System.out.println(pnt.getTarget().getName());
		
		pnt.setTarget(pm.allPeople[3]);
		System.out.println(pnt.getTarget().getName());
	}
}
