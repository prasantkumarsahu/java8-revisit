package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Author: PRASANT
 * Date: 16/04/25
 */

// Output - {4=1, 5=1, 6=2}

public class CollectorsGroupingByWithDownstreamCollectorDemo {
	public static void main(String[] args) {
		List<String> fruits = List.of("apple", "banana", "cherry", "date");

		Map<Integer, Long> result = fruits.stream()
				.collect(Collectors.groupingBy(String :: length, Collectors.counting()));

		System.out.println(result);
	}
}
