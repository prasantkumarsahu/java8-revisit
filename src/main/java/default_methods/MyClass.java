package default_methods;

/**
 * Author: PRASANT
 * Date: 02/01/25
 */

interface Parent {
	default void sayHello() {
		System.out.println("Hello");
	}
}

class Child implements Parent {
	@Override
	public void sayHello() {
		System.out.println("Child says Hello!");
	}
}

public class MyClass {
	public static void main(String[] args) {
		Parent child = new Child();

		child.sayHello();
	}
}
