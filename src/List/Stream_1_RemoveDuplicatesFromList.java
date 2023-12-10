package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream_1_RemoveDuplicatesFromList {
	
	public static void main(String[] args) {
		List<String> listWithDuplicates = Arrays.asList("Selenium","Java","Python","JS","Selenium");
		List<String> listWithoutDuplicates = new  ArrayList<String>();
		
		for(String elements:listWithDuplicates) {
			if (!(listWithoutDuplicates.contains(elements))) {
				listWithoutDuplicates.add(elements);
			}
		}
		System.out.println("List without duplicates "+listWithoutDuplicates);
		System.out.println("=============Removing Duplicates using Stream API================");
		//using Stream Api
		List<String> listWithoutDuplicatesUsingStream = listWithDuplicates
														.stream()
				   									    .distinct()
													    .collect(Collectors.toList());
		System.out.println(listWithoutDuplicatesUsingStream);
		
	}

}
