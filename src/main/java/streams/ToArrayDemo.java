package streams;

import java.util.List;

/**
 * Author: PRASANT
 * Date: 14/04/25
 */

public class ToArrayDemo {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 4, 7, 3, 9, 2, 5);

		Integer[] integers = list.stream()
				.filter(x -> x > 3)
//				.toArray(); // returns Object[]
				.toArray(Integer[] :: new);

		for (Integer i : integers) System.out.println(i);
	}
}
