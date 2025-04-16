package lambda_expressions;

import lambda_expressions.functional_interface.Employee;

/**
 * Author: PRASANT
 * Date: 02/01/25
 */

public class Main {
	public static void main(String[] args) {
		Employee se = () -> "Software Engineer";
		Employee editor = () -> "Editor";
		System.out.println(se.getName());
		System.out.println(editor.getName());
	}
}
