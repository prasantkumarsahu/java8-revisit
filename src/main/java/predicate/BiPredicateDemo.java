package predicate;

import java.util.function.BiPredicate;

/**
 * Author: PRASANT
 * Date: 06/01/25
 */

public class BiPredicateDemo {
	public static void main(String[] args) {
		BiPredicate<String, Integer> biPredicate = (str, x) -> str.length() == x;
		System.out.println(biPredicate.test("Prasant", 7));
	}
}
