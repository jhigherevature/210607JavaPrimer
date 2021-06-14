package accessone;

public class Example {
	private static String word;
	private String name;
	private int id;
	private double weight;
	private int age;
	private boolean alive;
	
	public String getWord() {
		return word;
	}
	
	public void setWord(String word) {
		Example.word = word;
	}
	
	/*
	 * Getter methods (a.k.a. accessor methods) are used to look
	 * at the fields on a class
	 */
	public String getName() {
		return this.name;
	}
	
	/*
	 * Setter methods (a.k.a. mutator methods) are used to change
	 * the fields on a class 
	 */
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	protected double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	private int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	@Override
	public String toString() {
		return "Example [name=" + name + ", id=" + id + ", weight=" + weight + 
				", age=" + age + ", alive=" + alive + "]";
	}
}
