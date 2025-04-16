package predicate;

import java.util.Arrays;
import java.util.List;

/**
 * Author: PRASANT
 * Date: 02/01/25
 */

public class MyClass {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		int sum = numbers.stream()
				.filter(n -> n % 2 == 0)
				.mapToInt(n -> n)
				.sum();

		System.out.println(sum);
	}
}
