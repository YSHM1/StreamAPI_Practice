package LambdaExample;

public class VehicleImplementation {
	
	public static void main(String[] args) {
		
		Vehicle vehicle1 = 
			() -> {
				System.out.println("Vehicle1 Honking");
			};
		
		vehicle1.honking();
		
		Vehicle vehicle2 = () -> System.out.println("Vehicle2 honking"); // for single statement {} are not needed
		vehicle2.honking();
	}

}
