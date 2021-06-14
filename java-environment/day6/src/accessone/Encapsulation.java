package accessone;

public class Encapsulation {
	public String pubStr = "Public String";
	protected String proStr = "Protected String";
	String defStr = "Default/Package-private String";
	private String priStr = "Private String";
	
	public static void main(String[] args) {
		Encapsulation e = new Encapsulation();
		System.out.println(e.pubStr);
		System.out.println(e.proStr);
		System.out.println(e.defStr);
		System.out.println(e.priStr);
	}
}
