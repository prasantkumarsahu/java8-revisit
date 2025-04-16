package newdateandtimeapis;

import java.time.Duration;
import java.time.Instant;

/**
 * Author: PRASANT
 * Date: 08/01/25
 */

public class DurationDemo {
	public static void main(String[] args) {
		Instant start = Instant.now();
		Instant end = Instant.now();

		Duration d1 = Duration.between(start, end);
		System.out.println(d1.isNegative());
	}
}
