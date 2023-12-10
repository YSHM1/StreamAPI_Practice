package anonymous_class_example;

public class PersonalCarAnonymousClass {

	public static void main(String[] args) {

		Car c = new Car() {
			public void horn() {
				System.out.println("60 db");
			}
		};

		c.horn();
		c.horn();

		new Car() {
			public void horn() {
				System.out.println("80 db");
			}
		}.horn();

		final int count = 10; //local variable must be final

		new Car() {
			public void horn() {
				System.out.println("80 db " + count);
			}
		}.horn();

		int count1 = 20; // or local variable must be effectively final

		new Car() {
			public void horn() {
				System.out.println("80 db " + count1);
			}
		}.horn();
		
		int count2 = 30; 
//		count2=40; // or local variable must be final or effectively final else we will get CTE
		new Car() {
			public void horn() {
				System.out.println("80 db " + count2);
			}
		}.horn();
		
		
	}

}
