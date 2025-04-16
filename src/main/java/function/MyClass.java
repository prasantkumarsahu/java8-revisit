package function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Author: PRASANT
 * Date: 04/01/25
 */

public class MyClass {
	public static void main(String[] args) {
//		Function<String, Integer> function = x -> x.length();
//		Function<String, String> function1 = x -> x.substring(0, 3);
//		Function<List<Student>, List<Student>> studentWithVipAsPrefix = li -> {
//			List<Student> res = new ArrayList<>();
//			for (Student s : li) {
//				if (function1.apply(s.getName()).equalsIgnoreCase("vip")) {
//					res.add(s);
//				}
//			}
//
//			return res;
//		};
//
//		Student student1 = new Student(1, "Vipul");
//		Student student2 = new Student(2, "Viplav");
//		Student student3 = new Student(3, "Arnab");
//
//		List<Student> students = Arrays.asList(student1, student2, student3);
//
//		List<Student> vipStudents = studentWithVipAsPrefix.apply(students);
//		System.out.println(vipStudents);

//		Function<Integer, Integer> function = x -> 2 * x;
//		Function<Integer, Integer> function1 = x -> x * x * x;
//		Integer res1 = function.andThen(function1).apply(3);
//		Integer res2 = function1.andThen(function).apply(3);
//		Integer res3 = function.compose(function1).apply(3);

//		System.out.println(res1);
//		System.out.println(res2);
//		System.out.println(res3);

		Function<Integer, Integer> identity = Function.identity();
		Integer res = identity.apply(5);
		System.out.println(res);
	}

	private static class Student {
		private int id;
		private String name;

		public Student(int id, String name) {
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Student{" +
					"id=" + id +
					", name='" + name + '\'' +
					'}';
		}
	}
}
