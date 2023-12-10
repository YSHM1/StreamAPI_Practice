package anonymous_class_example;

public class PersonalCar extends Car {
	
	public void horn() {
		System.out.println("60 db");
	}
	
	public static void main(String[] args) {
		PersonalCar pCar = new PersonalCar();
		pCar.horn();
	}

}
