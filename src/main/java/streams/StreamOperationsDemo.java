package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: PRASANT
 * Date: 06/01/25
 */

public class StreamOperationsDemo {
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(13, 29, 875, 284, 297, 37, 28, 8, 2, 24, 2);
		List<Integer> result = integerList.stream().filter(x -> x % 2 == 0)
				.map(x -> x / 2)
				.distinct()
				.sorted((a, b) -> b - a)
				.limit(4)
				.skip(1)
				.peek(System.out::println)
				.<Integer>mapMulti((x, consumer) -> consumer.accept(x + 10))
				.toList(); // since java - 16
//				.collect(Collectors.toList());

		System.out.println(result);
	}
}
