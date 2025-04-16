package comparator_with_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: PRASANT
 * Date: 02/01/25
 */

public class MyClass {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(35);
		list.add(23);
		list.add(9);
		list.add(26);
		list.add(1);

		list.sort((a, b) -> b - a);

		System.out.println(list);
	}
}
