package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Author: PRASANT
 * Date: 20/04/25
 */

// Output - {banana=6, apple=5, cherry=6}

public class CollectorsToMapDemo {
	public static void main(String[] args) {
		List<String> list = List.of("apple", "banana", "cherry");

		Map<String, Integer> result = list.stream()
				.collect(Collectors.toMap(Function.identity(), String :: length));

		System.out.println(result);
	}
}
