package streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: PRASANT
 * Date: 17/04/25
 */

// Output - [2, 8, 6, 4]

public class CollectorsFilteringDemo {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(2, 7, 8, 9, 6, 1, 4);

		List<Integer> result = numbers.stream()
				.collect(Collectors.filtering(x -> x % 2 == 0, Collectors.toList()));

		System.out.println(result);
	}
}
