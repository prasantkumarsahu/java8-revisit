package default_methods;

/**
 * Author: PRASANT
 * Date: 02/01/25
 */

interface A {
	default void sayHello() {
		System.out.println("A says Hello");
	}
}

interface B {
	default void sayHello() {
		System.out.println("B says Hello");
	}
}

public class AmbiguityTest implements A, B{
	@Override
	public void sayHello() {
		A.super.sayHello(); // or you can give your own implementation
	}
}
