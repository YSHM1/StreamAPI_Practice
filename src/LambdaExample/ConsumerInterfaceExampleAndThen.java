package LambdaExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExampleAndThen {
	
	public static void main(String[] args) {
		Consumer<String> c1 = (t) -> System.out.println("value is : " + t);
		Consumer<String> c2 = (t) -> System.out.println("Updated value is : " + t);
		c1.andThen(c2).accept("yash");

		
		System.out.println("======================using forEach()=======================");
		List<String> names = new ArrayList<String>();
		names.add("YASH");
		names.add("ABCD");
		
		names.forEach(c1.andThen(c2));
	}

}
