package streams;

import java.util.List;
import java.util.Optional;

/**
 * Author: PRASANT
 * Date: 14/04/25
 */

public class MaxMinDemo {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 4, 7, 3, 9, 2, 5);

		Optional<Integer> max = list.stream()
				.max(Integer :: compareTo);
		System.out.println("Max value is : " + max.get());

		Optional<Integer> min = list.stream()
				.min(Integer :: compareTo);
		System.out.println("Min value is : " + min.get());
	}
}
