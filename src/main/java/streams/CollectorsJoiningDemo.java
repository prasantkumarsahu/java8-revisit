package streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: PRASANT
 * Date: 14/04/25
 */

// Output - [apple, banana, cherry]

public class CollectorsJoiningDemo {
	public static void main(String[] args) {
		List<String> list = List.of("apple", "banana", "cherry");

		String fruits = list.stream()
				.collect(Collectors.joining(", ", "[", "]"));

		System.out.println(fruits);
	}
}
