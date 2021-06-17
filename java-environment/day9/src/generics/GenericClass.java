package generics;

/*
 * A generic (denoted by angle brackets '<>') specifies
 * a placeholder name for any object type in your program...
 */
public class GenericClass<Type> {
	public Type data;
	
	public GenericClass(Type data) {
		this.data = data;
	}
	
	public Type getData() {
		return data;
	}
}
