package streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: PRASANT
 * Date: 16/04/25
 */

// Output - [5, 6, 6]

public class CollectorsMappingDemo {
	public static void main(String[] args) {
		List<String> fruits = List.of("apple", "banana", "cherry");

		List<Integer> result = fruits.stream()
				.collect(Collectors.mapping(String :: length, Collectors.toList()));

		System.out.println(result);
	}
}
