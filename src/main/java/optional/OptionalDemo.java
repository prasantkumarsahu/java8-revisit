package optional;

import java.util.Optional;

/**
 * Author: PRASANT
 * Date: 08/01/25
 */

// Introduced in Java - 5.0

public class OptionalDemo {

	public static void main(String[] args) {
		Optional<String> userOptional = getUser();

		userOptional.ifPresent(System.out :: println);
	}

	public static Optional<String> getUser() {
		return Optional.of("Ram");
	}
}
