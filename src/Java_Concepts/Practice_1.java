package Java_Concepts;

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

	}

	public static void main(String[] args) {
		p17();
	}

}
