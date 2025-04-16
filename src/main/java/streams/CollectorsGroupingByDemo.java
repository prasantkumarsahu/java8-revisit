package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Author: PRASANT
 * Date: 14/04/25
 */

public class CollectorsGroupingByDemo {
	public static void main(String[] args) {
		List<Person> users = List.of(
				new Person("Prasant", "Bangalore", 1234567890),
				new Person("Kalia", "Bangalore", 1234567890),
				new Person("Sipun", "Angul", 1234567890)
		);

		Map<String, List<Person>> usersMap = users.stream()
				.collect(Collectors.groupingBy(Person :: getCity));

		usersMap.forEach((key, userList) -> {
			System.out.print(key + " : ");
			userList.forEach(user -> System.out.print(user.getName() + ", "));
			System.out.println();
		});
	}
}

class Person {
	private String name;
	private String city;
	private Integer number;

	public Person(String name, String city, Integer number) {
		this.name = name;
		this.city = city;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
}
