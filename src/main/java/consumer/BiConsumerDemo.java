package consumer;

import java.util.function.BiConsumer;

/**
 * Author: PRASANT
 * Date: 06/01/25
 */

public class BiConsumerDemo {
	public static void main(String[] args) {
		BiConsumer<String, String> biConsumer = (firstName, lastName) -> System.out.printf("%s %s", firstName, lastName);
		biConsumer.accept("Prasant", "Sahu");
 	}
}
