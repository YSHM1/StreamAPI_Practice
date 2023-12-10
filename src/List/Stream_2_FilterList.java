package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_2_FilterList {
	public static void main(String[] args) {
		List<String> allSubs = Arrays.asList("Java", "Selenium Testing", "Database Testing", "API Testing", "MongoDb", "APIs");
		List<String> filteredList = new ArrayList<String>();
		
		for (String ele : allSubs) {
			if (ele.contains("Testing")) {
				filteredList.add(ele);
			} 
		} 
		
		System.out.println("Filtered List = "+filteredList);
		
		System.out.println("============== Filter List using Stream ==================");
		List<String> filteredListWithStream = allSubs
												.stream()
												.filter(ele -> ele.contains("Testing") || ele.contains("API"))
												.collect(Collectors.toList());
		System.out.println(filteredListWithStream);
	}
}
