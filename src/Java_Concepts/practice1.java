package Java_Concepts;

public class practice1 {

	static void p1() {

		int n = 10;
		for (int i = n; i >= 1; i--) {
			System.out.println(i);
		}
	}

	static void p2() {

		int n = 5;
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
	}

	static void p3() {

		int n = 3;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	static void p4() {

		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	static void p5() {

		int n = 3;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	static void p6() {

		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print("*" + " ");

			}
			System.out.println();
		}
	}

	static void p7() {

		int n = 3;
		int temp = 1;
		for (int i = n; i > 0; i--) {
			temp = temp * i;
		}
		System.out.println(temp);
	}

	static void p8() {

		int n = 4;

		for (char i = 'A'; i < 'E'; i++) {
			for (int j = 0; j < n; j++) {

				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

	static void p9() {

		int n = 4;

		for (int i = 0; i < n; i++) {
			for (char j = 'A'; j < 'E'; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	static void p10() {

		int n = 4;

		for (char i = 'A'; i < 'E'; i++) {
			for (char j = 'A'; j <= i; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	static void p11() {

		int n = 8;
		int count = 0;

		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				count++;
			} else {

			}

		}

		if (count == 2) {
			System.out.println("Prime Number");
		} else

		{
			System.out.println("Not a prime number");
		}
	}

	public static void main(String[] args) {

		p11();
	}

}
