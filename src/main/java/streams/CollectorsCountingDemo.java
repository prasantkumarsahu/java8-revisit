package streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: PRASANT
 * Date: 16/04/25
 */

public class CollectorsCountingDemo {
	public static void main(String[] args) {
		List<String> list = List.of("apple", "banana", "cherry");

		Long count = list.stream()
				.collect(Collectors.counting());

		System.out.println(count);
	}
}
