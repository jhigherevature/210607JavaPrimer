package constructors;

public class Example {
	String name;
	int id;
	float length;
	
	public Example(String name, int id, float length) {
		System.out.println("String, int, float");
	}
	
	public Example(String name, float length, int id) {
		System.out.println("String, float, int");
	}
	
	public static void main(String[] args) {
		Example e1 = new Example("My Name", 5.4f, 7);
		Example e2 = new Example("My Name", 7, 5.4f);
	}
}
