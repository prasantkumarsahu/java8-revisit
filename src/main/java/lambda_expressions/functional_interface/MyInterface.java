package lambda_expressions.functional_interface;

/**
 * Author: PRASANT
 * Date: 02/01/25
 */

@FunctionalInterface
public interface MyInterface {
	void sayHello();

	default void sayBye() {
		System.out.println("Bye");
	}

	static void sayOk() {
		System.out.println("Ok");
	}
}
