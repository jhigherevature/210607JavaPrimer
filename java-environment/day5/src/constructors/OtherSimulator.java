package constructors;

/*
 * The 'auto-import' hotkey combination in
 * STS is CTRL + O (CMD + O in mac)
 */
import example.UnitConverter;
import animals.Dog;

public class OtherSimulator {
	public static void main(String[] args) {
		UnitConverter uc = new UnitConverter();
		
		/*
		 * Fully-Qualified Class Name:
		 * 	Stating the name of a class that exists
		 * 	in your project, including the package
		 * 	declaration.
		 */
		Dog animals = new Dog();	// uses the 'animals' package because of our import statement above
		constructors.Dog constructors = new constructors.Dog();	// FQCN for constructors package
		example.Dog example = new example.Dog(); // FQCN for example package
	}
}
