package cunstroctorreference;

import java.util.Arrays;
import java.util.List;

/**
 * Author: PRASANT
 * Date: 06/01/25
 */

public class Main {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Prasant", "Sipun", "Akash");

		List<Student> students = names.stream().map(Student :: new).toList();
	}
}
