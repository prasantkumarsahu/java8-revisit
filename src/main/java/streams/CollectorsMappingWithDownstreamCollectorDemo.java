package streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: PRASANT
 * Date: 18/04/25
 */

// Output - 17

public class CollectorsMappingWithDownstreamCollectorDemo {
	public static void main(String[] args) {
		List<String> fruits = List.of("apple", "banana", "cherry");

		Integer result = fruits.stream()
				.collect(Collectors.mapping(String :: length, Collectors.summingInt(Integer :: intValue)));

		System.out.println(result);
	}
}
