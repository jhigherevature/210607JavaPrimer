package lambdas;

public class Simulator {
	public static void main(String[] args) {
		HelloWorldInterface hwc = new HelloWorldClass();
		hwc.sayHello();

		HelloWorldInterface helloLam = () -> {
			System.out.println("Hello World from Lambda");
		};
		helloLam.sayHello();
	}
}
