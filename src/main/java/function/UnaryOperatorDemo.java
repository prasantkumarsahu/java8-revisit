package function;

import java.util.function.UnaryOperator;

/**
 * Author: PRASANT
 * Date: 06/01/25
 */

public class UnaryOperatorDemo {
	public static void main(String[] args) {
		UnaryOperator<String> unaryOperator = str -> str.toUpperCase();
		System.out.println(unaryOperator.apply("prasant"));
	}
}
