package supplier;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Author: PRASANT
 * Date: 06/01/25
 */

public class Main {
	public static void main(String[] args) {
		Predicate<Integer> predicate = x -> x % 2 == 0;
		Function<Integer, Integer> function = i -> i * i;
		Consumer<Integer> consumer = i -> System.out.println(i);
		Supplier<Integer> supplier = () -> 100;

		if (predicate.test(supplier.get())) {
			consumer.accept(function.apply(supplier.get()));
		}
	}
}
