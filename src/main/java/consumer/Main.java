package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Author: PRASANT
 * Date: 06/01/25
 */

public class Main {
	public static void main(String[] args) {
		Consumer<String> stringConsumer = s -> System.out.println(s);
//		stringConsumer.accept("Prasant");

		Consumer<List<Integer>> listConsumer1 = li -> {
			for (int i : li) {
				System.out.println(i);
			}
		};

		Consumer<List<Integer>> listConsumer2 = li -> {
			for (int i : li) {
				System.out.println(i + 100);
			}
		};

		listConsumer1.andThen(listConsumer2).accept(Arrays.asList(1, 3, 5, 7));
	}
}
