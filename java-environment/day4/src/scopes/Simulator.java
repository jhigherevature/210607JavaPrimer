package scopes;

public class Simulator {

	public static void main(String[] args) {
		Dog scooby = new Dog("Scooby Doo", 7);
		Dog brian = new Dog("Brian", 5);
		
		System.out.println(scooby.name);
		System.out.println(brian.name);
		
		System.out.println(scooby.count);
		System.out.println(brian.count);
		/* 
		 * static fields (and methods) can be accessed 
		 * by calling the name of the class directly
		 */
		System.out.println(Dog.count);	
	}

}
