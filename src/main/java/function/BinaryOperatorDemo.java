package function;

import java.util.function.BinaryOperator;

/**
 * Author: PRASANT
 * Date: 06/01/25
 */

public class BinaryOperatorDemo {
	public static void main(String[] args) {
		BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + " " + str2;
		System.out.println(binaryOperator.apply("Prasant", "Sahu"));
	}
}
