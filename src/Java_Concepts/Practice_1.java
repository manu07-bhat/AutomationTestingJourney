package Java_Concepts;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice_1 {

	static void p1() {
//		1.Program to check given number is even or odd:

		int num = 6;

		if (num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

	static void p2() {
//		2.Print all the Odd numbers betwen 1 to 100:

		int num = 100;

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

	static void p3() {
//		3.Count of odd numbers   between 1 to 100

		int num = 100, count = 0;

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1) {
				count++;
			}
		}
		System.out.println(count);
	}

	static void p4() {
//		4.Print all the even numbers betwen 1 to 100:

		int num = 100;

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	static void p5() {
//		5.Count of even numbers   between 1 to 100

		int num = 100, count = 0;

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

	static void p6() {
		int num = 12345;

		int res = 0;

		int rem = 0;

		while (num > 0) {

			rem = num % 10;

			res = (res * 10) + rem;

			num = num / 10;

		}

		System.out.println("Reverse  " + res);

	}

	static void p7() {
//		7.To check the given number is palindrome or not:

		int num = 1201;
		int n = num;
		int res = 0;
		int rem = 0;

		while (num > 0) {
			rem = num % 10;
			res = (res * 10) + rem;
			num = num / 10;

		}

		System.out.println("rev: " + res);
		if (n == res) {
			System.out.println("Palandrome");
		} else {
			System.out.println("not Palandrome");
		}
	}

	static void p8() {
//		8.To check the given number is Armstrong number:
		int num = 153;
		int n = num;
		int res = 0;
		int rem = 0;

		while (num > 0) {
			rem = num % 10;
			res = res + (rem * rem * rem);
			num = num / 10;

		}

		System.out.println("rev: " + res);
		if (n == res) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("not Armstrong number");
		}

	}

	static void p9() {
//		9.To find the sum of the digits in a given number:

		int num = 153;
		int res = 0;
		int rem = 0;

		while (num > 0) {
			rem = num % 10;
			res = res + rem;
			num = num / 10;

		}

		System.out.println("sum: " + res);
	}

	static void p10() {
//		10.To find the product of the digits in a given number:

		int num = 222;
		int res = 1;
		int rem = 0;

		while (num > 0) {
			rem = num % 10;
			res = res * rem;
			num = num / 10;
		}
		System.out.println(res);

	}

	static void p11() {
//		11.To find the count of the digits in a given number:

		int num = 123345;
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		System.out.println(count);
	}

	static void p12() {
//		12.Factorial of the given number:
		int num = 5;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	static void p13() {
//		13.Fibbonacci series for the given number:

		int n = 10;
		int a = 0, b = 1;

		System.out.print(a + " " + b + " ");
		for (int i = 0; i < n; i++) {
			int c = a + b;

			System.out.print(c + " ");
			a = b;
			b = c;
		}

	}

	static void p14() {
//		14.Find the reverse of the given string:

		String s1 = "jonaM";
		String rev = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}
		System.out.println(rev);
	}

	static void p15() {
//		14.Check whether the given string is palindrome or not

		String s1 = "MAM";
		String s2 = "";

		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		if (s1.equals(s2)) {
			System.out.println("Palandrome");
		} else {
			System.out.println("Not a Palandrome");
		}
	}

	static void p16() {
//		15.To find the reverse of each word:

		String s1 = "enoyreve gninrom dooG";
		String s2 = "";
		String s3 = " ";

		for (int i = s1.length() - 1; i >= 0; i--) {
			if (s1.charAt(i) != ' ') {
				s2 = s2 + s1.charAt(i);
			} else {
				s2 = s2 + s3;
			}
		}
		System.out.println(s2);

	}

	static void p17() {

//		16.To Change each word's first letter to upper case:

		String s1 = "welcome to home";

		String[] s2 = s1.split(" ");

		String res = "";

		for (String s : s2) {

			char c = s.charAt(0);
			String sub = s.substring(1);
			res = res + Character.toUpperCase(c) + sub + " ";
		}
		System.out.println(res);

	}

	static void p18() {
//		17.To remove character duplicates from String:

		String s1 = "raining here...";

		String res = "";

		LinkedHashSet<Character> i = new LinkedHashSet<Character>();

		for (int j = 0; j < s1.length(); j++) {
			char c = s1.charAt(j);

			i.add(c);
		}

		for (Character c : i) {
			res = res + c;
		}

		System.out.println(res);
	}

	static void p19() {
//		18.To remove word duplicates from a String:
		String s1 = "java sql java python sql";

		String res = "";

		LinkedHashSet<String> i = new LinkedHashSet<String>();

		String[] s2 = s1.split(" ");

		for (String s : s2) {

			i.add(s);

		}

		for (String c : i) {
			res = res + c + " ";
		}

		System.out.println(res);
	}

	static void p20() {
//		19.To remove the duplicates and to sort elements from Array:

		int n[] = { 10, 20, 30, 40, 50, 10, 20, 30 };

		LinkedHashSet<Integer> t = new LinkedHashSet<Integer>();
//		TreeSet<Integer> t = new TreeSet<Integer>();

		for (int i = 0; i < n.length; i++) {
			t.add(n[i]);
		}

		System.out.println(t);
	}

	static void p21() {
//		20.To sort numbers   in ascending order:

		int arr[] = { 1, 2, 3, 4, 5, 6, 11, 21, 2, 3, 1, 7, 6, 5 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					int temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;

				}
			}
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	static void p22() {
//	21.To sort elements in descending order:

		int arr[] = { 1, 2, 3, 4, 5, 6, 11, 21, 2, 3, 1, 7, 6, 5 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (arr[i] < arr[j]) {

					int temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;

				}
			}
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	static void p23() {

//		22.To add each odd and even pair in an array: || not sure

		int arr[] = { 10, 20, 30, 40, 50 };

		try {

			for (int i = 0; i < arr.length; i = i + 2) {

				System.out.println(arr[i] + arr[i + 1]);

			}
		} catch (Exception e) {
			System.out.println(arr[arr.length - 1]);
		}

	}

	static void p24() {
//		30.To check the given number is prime or not:

		int count = 0;
		int n = 7;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println("Given number is prime");
		} else {
			System.out.println("Not prime");
		}

	}

	static void p25() {
//		31.Generate the given pattern:
		/*
		 * * ** *** ****
		 * 
		 */
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void p26() {
//		32.Generate the given pattern:
//			1
//
//			2 2
//
//			3 3 3

		int n = 3;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	static void p27() {
//		33.Generate the given pattern:
//			1
//
//			1 2
//
//			1 2 3

		int n = 3;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		p27();
	}

}
