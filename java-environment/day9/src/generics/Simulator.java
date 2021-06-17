package generics;

public class Simulator {
	public static void main(String[] args) {
		GenericClass<String> gcStr = new GenericClass<String>("Hello");
		GenericClass<Integer> gcInt = new GenericClass<Integer>(123);
		
	}
}
