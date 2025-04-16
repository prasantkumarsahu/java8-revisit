package methodreference;

import java.util.Arrays;
import java.util.List;

/**
 * Author: PRASANT
 * Date: 06/01/25
 */

public class Main {
	public static void print(String s) {
		System.out.println(s);
	}

	public void display(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Prasant", "Sipun", "Akash");
//		list.forEach(Main::print);

		Main main = new Main();
		list.forEach(main::display);
	}
}
