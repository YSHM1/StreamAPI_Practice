package anonymous_class_example;

public class MyInterfaceAnonymousExample {
	
	public static void main(String[] args) {
		
		MyInterface myInterface = new MyInterface() {
			
			@Override
			public void add() {
				System.out.println("adding");
			}
		};
		
		myInterface.add();
		
	}

}
