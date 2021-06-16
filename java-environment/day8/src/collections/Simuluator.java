package collections;

public class Simuluator {
	public static void main(String[] args) {
		NodeStack ns = new NodeStack();
		
		ns.push(76);
		ns.push(115);
		ns.push(0);
		
		System.out.println(ns.peek());	// 0
		ns.pop();	// remove '0' from the stack
		System.out.println(ns.peek());	// 115
		ns.pop();	// remove '115' from the stack
		System.out.println(ns.peek());	// 76
	}
}
