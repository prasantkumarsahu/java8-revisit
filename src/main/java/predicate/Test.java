package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Author: PRASANT
 * Date: 02/01/25
 */

public class Test {
	public static void main(String[] args) {
		Predicate<Integer> isAdult = x -> x >= 18;
		System.out.println(isAdult.test(23));

		Predicate<Integer> isEven = x -> x % 2 == 0;
		Predicate<Integer> isGreaterThanFive = x -> x > 5;
		Predicate<Integer> and = isEven.and(isGreaterThanFive);
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		for (Integer num : list) {
			if (and.test(num)) System.out.println(num);
		}
	}
}
