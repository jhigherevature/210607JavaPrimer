package variables;

/*
 * As described below, 'pass-by-value' means that we are only 
 * interested in the information stored in a variable, when we
 * provide arguments to a method, but not the actual variable
 * in our stack/heap memory.
 * 
 * 'pass-by-reference' languages will directly manipulate the
 * variable that we provide to a method, when one is given...
 * This means, if we modify a parameter in the body of a method
 * that change would also be reflected on any variable we provide
 * to the method as an argument...
 */
public class PassByValueVsReference {
	public static void main(String[] args) {
		int num = 9;
//		System.out.println("modifyPrimitive: " + modifyPrimitive(num)); // 14
//		value = modifyPrimitive(num); // if I want to actually change the value of 'num'
//		System.out.println("value: " + num); // 9
		
		
//		System.out.println("Data d has an id of: " + d.id); // 101 is id
//		modifyData(d); // this prints an id of 12
//		System.out.println("Data d has an id of: " + d.id); // 
		
		Data d = new Data(101);
		Data j = d;
		Data z = new Data(101);
		
		System.out.println(d);
		System.out.println(j);
		
		System.out.println(z);
		System.out.println("d id: " + d.id);
		System.out.println("j id: " + j.id);
		System.out.println("z id: " + z.id);
		d.id = 15;
		System.out.println("d id: " + d.id);
		System.out.println("j id: " + j.id);
		System.out.println("z id: " + z.id);
	}
	
	/*
	 * Java is a pass-by-value language...
	 * 		pass-by-value means that, when you invoke a method
	 * 		and provide an argument to that method, the only
	 * 		data that is given to the method is the value stored
	 * 		within the variable, but NOT the variable itself...
	 */
	public static int modifyPrimitive(int input) {
		input = input + 5;
		return input;
	}
	
	/*
	 * Java is a PASS-BY-VALUE LANGUAGE!!!
	 * 
	 * When you provide an object reference to a method
	 * it seemingly looks like Java is a pass-by-reference
	 * language, however, the value stored within a reference
	 * variable is a memory address... this is why, changes
	 * to the variable within a method effects the argument
	 * passed to the method
	 */
	public static void modifyData(Data input) {
		input.id = 12;
		System.out.println("Inside modify data: " + input.id);
	}
	
}
