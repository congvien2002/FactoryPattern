package demo;

public class Order {

	public static void main(String[] args) {
		Factory factory = new Factory();
		
		factory.call("rice");
		factory.call("pasta");
		factory.call("KFC");

		

	}

}
