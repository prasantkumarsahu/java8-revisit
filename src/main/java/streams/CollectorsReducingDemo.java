package streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: PRASANT
 * Date: 20/04/25
 */

// Output - 34

public class CollectorsReducingDemo {
	public static void main(String[] args) {
		List<Integer> nums = List.of(1, 6, 8, 3, 9, 5, 2);

		Integer sum = nums.stream()
				.collect(Collectors.reducing(0, Integer :: sum));

		System.out.println(sum);
	}
}
