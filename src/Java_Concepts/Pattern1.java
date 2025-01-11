package Java_Concepts;

public class Pattern1 {

	static void p1() {
		int n = 5;
		for (int i = 0; i < n; i++) {
			System.out.println("*");
		}
	}

	static void p2() {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	static void p3() {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	static void p4() {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	static void p5() {
		int n = 10;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (i == 1 || i == n - 1 || j == 1 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void p6() {
		int n = 5;
		int count = 1;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (count < 10) {
					System.out.print("0" + count + " ");
					count++;
				} else {
					System.out.print(count + " ");
					count++;
				}
			}
			System.out.println();
		}
	}

	static void pal() {
		// palandrome
		String s1 = "WOW";
		int i = 0, j = s1.length() - 1;

		while (i <= j) {
			if (s1.charAt(i) != s1.charAt(j)) {
				System.out.println("Not a palandrome");
				System.exit(0);
			} else {
				i++;
				j--;
			}
		}
		System.out.println("Palandrome");

	}
	
	static void Prime() {
		int s = 21;
		int flag = 0;

		for (int i = 1; i <= s; i++) {

			if (s % i == 0) {
				flag++;
			}
		}

		if (flag == 2) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not a Prime num");
		}
	}
	
	static void max() {
		int a[] = { 10, 23, 50, 3, 1, 22, 0 };

		int count = 0;

		for (int i = 0; i < a.length; i++) {

			if (count < a[i]) {
				count = a[i];
			}
		}
		System.out.println(count);
	}
	
	static void fact() {
		int a = 5;
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}

		System.out.println(fact);
	}
	
	public static void main(String[] args) {

		pal();

	}

}
