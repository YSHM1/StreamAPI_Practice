package LambdaExample;

public class VehicleNameImplementation {
	
	public static void main(String[] args) {
		
		VehicleName vName = (name) -> {
										return name;
									  }; // if abstract method has return type then 
									  //it necessary to use {} even incase of single statement
		
		System.out.println(vName.vehicleName("BMW"));  
		
		VehicleName vName1 = (name) -> {
			System.out.println("Vehicle is : "+name);
			return name;
		};
		String result = vName1.vehicleName("AUDI");
		System.out.println("Result is : "+result);
		
	}

}
