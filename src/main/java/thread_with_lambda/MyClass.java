package thread_with_lambda;

/**
 * Author: PRASANT
 * Date: 02/01/25
 */

public class MyClass{
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Hello");
			}
		});

		thread.start();
		thread.join();

		System.out.println("Main finished!");
	}
}
