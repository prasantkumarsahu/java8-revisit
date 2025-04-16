package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Author: PRASANT
 * Date: 06/01/25
 */

public class StreamDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "cherry");
		Stream<String> listStream = list.stream();

		String[] arr = {"apple", "banana", "cherry"};
		Stream<String> arrStream = Arrays.stream(arr);

		Stream<Integer> integerStream = Stream.of(1, 2, 3);

		Stream<Integer> iterateStream = Stream.iterate(0, n -> n + 1).limit(100); // 0 - 99

		Stream<Integer> generatedStream = Stream.generate(() -> (int) (Math.random() * 100)).limit(5);
	}
}
