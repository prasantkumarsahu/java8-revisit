package static_methods_interface;

/**
 * Author: PRASANT
 * Date: 02/01/25
 */

interface A {
	static void sayHello() {
		System.out.println("Hello");
	}
}

public class MyClass implements A{
	public static void main(String[] args) {
		MyClass obj = new MyClass();
//		obj.sayHello(); // wrong
//		MyClass.sayHello(); // wrong
		A.sayHello();
	}
}
