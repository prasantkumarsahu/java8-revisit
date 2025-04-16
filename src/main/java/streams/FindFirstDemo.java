package streams;

import java.util.List;
import java.util.Optional;

/**
 * Author: PRASANT
 * Date: 14/04/25
 */

public class FindFirstDemo {
	public static void main(String[] args) {
		List<String> list = List.of("apple", "banana", "cherry");

		Optional<String> firstElement = list.stream()
				.filter(e -> e.contains("a"))
				.findFirst();

		System.out.println(firstElement.get());
	}
}
