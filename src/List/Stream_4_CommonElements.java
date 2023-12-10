package List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_4_CommonElements {
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("yash");
		list1.add("abcd");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("yash");
		list2.add("abcd");
		list2.add("efgh");
		
//		list2.retainAll(list1);
//		System.out.println(list2); retainAll() will remove all the element from list2 which are not similar to list1
		
		//using lambda expression
		List<String> list3 = list1.stream().filter(ele -> list2.contains(ele)).collect(Collectors.toList());
		System.out.println("using lambda expression : "+list3);
		
		//using method reference --> way of writing compact code by getting rid of obvious code
		List<String> list4 = list1.stream().filter(list2 :: contains).collect(Collectors.toList());
		System.out.println("Using Method Reference : "+list4);
		
		
	}

}
