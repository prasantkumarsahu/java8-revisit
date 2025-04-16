package newdateandtimeapis;

import java.time.LocalDate;

/**
 * Author: PRASANT
 * Date: 07/01/25
 */

public class LocalDateDemo {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate customDate = LocalDate.of(2001, 5, 10);

		int dayOfMonth = customDate.getDayOfMonth();
		int monthValue = customDate.getMonthValue();
		int year = customDate.getYear();

		LocalDate minusesMonths = customDate.minusMonths(100);

		System.out.println((dayOfMonth < 10 ? ("0" + dayOfMonth) : dayOfMonth) +
				"-" +
				(monthValue < 10 ? ("0" + monthValue) : monthValue) +
				"-" +
				year);
		System.out.println(minusesMonths);
	}
}
