package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Author: PRASANT
 * Date: 16/04/25
 */

// Output - {false=[1, 5, 3, 7], true=[8, 2, 6]}

public class CollectorsPartitioningByDemo {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 5, 3, 7, 8, 2, 6);

		Map<Boolean, List<Integer>> result = list.stream()
				.collect(Collectors.partitioningBy(n -> n % 2 == 0));

		System.out.println(result);
	}
}
