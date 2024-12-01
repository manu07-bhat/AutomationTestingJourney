package StreamsConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Part1Stream {

	static void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhi");
		names.add("Don");
		names.add("Alex");
		names.add("Adaaaam");
		names.add("Ram");
		names.add("Alaham");

		// There is no life for Itermidate operations if there is no terminal
		// Operations.
		// Terminal Operation will execute only if Itermidate operations [Filter] return
		// true
		// We can create stream
		// We can use filter in stream

		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);

		// count
		System.out.println(Stream.of("Abhi", "Don", "Alex", "Adam", "manoj").filter(s -> s.startsWith("A")).count());

		// Print the names where the length >4

		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));

		// Print the names where the length >4 with limit.

		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
	}

	static void streamMap() {

		// Print the last name x in UPER CASE
//		Stream.of("Abhi","Don","Alex","Adamx","manoj").filter(s->s.endsWith("x")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));

		// print the names which has first letter a and sorted and with uppercase
		List<String> names = Arrays.asList("Abhi", "Don", "Alex", "Adamx", "manoj");
		names.stream().filter(s -> s.startsWith("A")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Abhi");
		names1.add("Don");
		names1.add("Alex");

		// Merging 2 different lists
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		newStream.sorted().forEach(s -> System.out.println(s));

//		Boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Alex"));
//		System.out.println(flag);
//		Assert.assertTrue(flag);

	}

	static void illegalState() {
		ArrayList<String> names = new ArrayList<String>();

		names.add("Navnath");

		names.add("Girish");

		names.add("Shefali");

		names.add("Vaibhav");

		names.add("Arjun");

		names.add("Aaryan");

		names.add("Abhishek");

		names.stream()

				.filter(s -> s.startsWith("A"))

				.sorted()

				.map(String::toUpperCase)

				.forEach(System.out::println);

		List<String> names1 = Arrays.asList("Shagun", "Vivaan", "Sumedha", "Ankita", "Garima");

		names1.stream()

				.filter(s -> s.endsWith("a"))

				.map(String::toUpperCase)

				.forEach(System.out::println);

		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());

		newStream.sorted().forEach(System.out::println);

		// Recreate the stream before using anyMatch

		boolean flag = Stream.concat(names.stream(), names1.stream())

				.anyMatch(s -> s.equalsIgnoreCase("Garima"));

		System.out.println(flag);

		Assert.assertTrue(flag);
	}

	void oldList() {

		// Count the number of names starting with A in list
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhi");
		names.add("Don");
		names.add("Alex");
		names.add("Adam");
		names.add("Ram");

		int count = 0;
		for (int i = 0; i < names.size(); i++) {

			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}

		System.out.println(count);
	}

	static void streamCollect() {

		List<String> ls1 = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama").filter(s -> s.endsWith("a"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls1.get(0));

		List<Integer> values = Arrays.asList(3, 2, 2, 7, 5, 19, 7);
//		values.stream().distinct().sorted().forEach(s->System.out.println(s));

		// print the 3rd index in the form of list
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}

	public static void main(String[] args) {

		streamCollect();

	}

}
