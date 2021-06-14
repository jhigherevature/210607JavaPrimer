package variables;

public class WrapperClasses {
	public static void main(String[] args) {
		int num = 10;
		Integer number = num; // autobox a primitive to a Wrapper
		number = null; // because 'number' is the wrapper class, i can set the reference to null
//		num = null; // null does not work with primitives
		
		Integer wrapper = new Integer(10);
		int primitive = wrapper; // unboxing a wrapper to a primitive
		
		wrapper.toString();
	}
}
