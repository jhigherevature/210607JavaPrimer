package other;

public class Platypus {
	private String name;
	private int age;
	
	/*
	 * Constructors inform how must space in memory
	 * we need for objects, but they are moreso just
	 * used to initialize the values of fields on a
	 * an object
	 */
	public Platypus(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
