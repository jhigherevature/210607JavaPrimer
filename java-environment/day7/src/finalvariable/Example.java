package finalvariable;

public class Example {
	public final String inLine = "Cannot Change";
	public final String inConstructor;
	
	public Example(String inConstructor) {
		this.inConstructor = inConstructor;
	}
}
