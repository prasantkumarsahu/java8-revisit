package function;

import java.util.function.BiFunction;

/**
 * Author: PRASANT
 * Date: 06/01/25
 */

public class BiFunctionDemo {
	public static void main(String[] args) {
		BiFunction<String, String, Integer> biFunction = (str1, str2) -> str1.length() + str2.length();
		System.out.println(biFunction.apply("Prasant", "Sahu"));
	}
}
