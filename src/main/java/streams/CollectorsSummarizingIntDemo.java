package streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Author: PRASANT
 * Date: 16/04/25
 */

// Output - IntSummaryStatistics{count=7, sum=30, min=0, average=4.285714, max=9}

public class CollectorsSummarizingIntDemo {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 5, 7, 9, 4, 0, 4);

		IntSummaryStatistics stats = numbers.stream()
				.collect(Collectors.summarizingInt(Integer :: intValue));

		System.out.println(stats);
	}
}
