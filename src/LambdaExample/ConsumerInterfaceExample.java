package LambdaExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {

	public static void main(String[] args) {
		Consumer<String> c = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("value is : " + t);
			}

		};

		c.accept("yash");

		new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("value is : " + t);
			}

		}.accept("yash_1");
		;

		Consumer<String> c1 = (t) -> System.out.println("value is : " + t);
		c1.accept("Stream API Practice");

		Consumer<List<String>> c2 = (t) -> {
			for (String val : t) {
				String formattedVal = val.toLowerCase();
				System.out.println(formattedVal);
			}
		};

		List<String> names = new ArrayList<String>();
		names.add("YASH");
		names.add("ABCD");

		c2.accept(names);

		// using lambda expression
		names.forEach((name) -> System.out.println("Using Lambda expression : " + name));

		names.forEach((fn) -> {
			String forString = fn.toLowerCase();
			System.out.println("Using Lambda expression : " + forString);
		});
	}

}
