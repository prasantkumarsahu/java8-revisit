package streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Author: PRASANT
 * Date: 17/04/25
 */

// Output - 3

public class CollectorsCollectingAndThenDemo {
	public static void main(String[] args) {

		List<String> fruits = List.of("apple", "banana", "cherry", "banana");

		Integer size = fruits.stream()
				.collect(Collectors.collectingAndThen(Collectors.toSet(), Set :: size));

		System.out.println(size);
	}
}
