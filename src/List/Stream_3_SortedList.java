package List;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_3_SortedList {
	
	public static void main(String[] args) {
		
		List<Integer> unsortedList = Arrays.asList(1,45,87,33,25,14);
		Stream<Integer> unsortedListInStreamType = unsortedList.stream();
		List<Integer> ascSorted = unsortedListInStreamType
								  .sorted()
								  .collect(Collectors.toList());
		System.out.println("Sorting in Ascending Order : "+ascSorted);
		
		List<Integer> descSorted = unsortedList
								   .stream()
								   .sorted(Comparator.reverseOrder())
								   .collect(Collectors.toList());
		System.out.println("Sorting in Descending Order : "+descSorted);
		
		List<String> unsortedStringList = Arrays.asList("Yash", "Abcd", "abcd", "yash", "java");
		Stream<String> unsortedStringListStreamType = unsortedStringList.stream();
		List<String> ascString = unsortedStringListStreamType
								 .sorted()
								 .collect(Collectors.toList());
		System.out.println("Ascending Order : "+ascString);
		
		List<String> descString = unsortedStringList
								  .stream()
								  .sorted(Comparator.reverseOrder())
								  .collect(Collectors.toList());
        System.out.println("descending Order : "+descString);
		
	} 

}
