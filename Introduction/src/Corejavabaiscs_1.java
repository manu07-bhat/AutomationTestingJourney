import java.util.Scanner;

public class Corejavabaiscs_1 {

	void p1() {
		int s1 = 10;
		System.out.println(s1);
	}

	public static void main(String[] agrs) {
		// Program execution from here

		int num = 5;
		String s = "jackson";
		float f = 5.55f;
		double d = 4.33;
		char c = 'g';
		boolean b = true;

		Corejavabaiscs_1 obj = new Corejavabaiscs_1();
		obj.p1();
		System.out.println(num + s + c + d);

		// Array
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[5];

//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = scan.nextInt();
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		

		// type 2 | Array

		int[] arr2 = new int[5];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[3] = 3;

		System.out.println(arr2[0]);

		// type 3 | array
		int[] arr3 = { 1, 2, 2, 3, 4, 5 };

		System.out.println(arr3[3]);
//		for (int j = 0; j < arr3.length; j++) {
//			System.out.println(arr3[j]);
//
//		}

		// string array

//		String[] st = new String[5];
//		for (int i = 0; i < st.length; i++) {
//			st[i] = scan.next();
//		}
//
//		for (int i = 0; i < st.length; i++) {
//			System.out.println(st[i]);
//		}
			
		String []name = {"My", "name", "is", "manoj"};
		for (String ws : name) {
			System.out.print(ws+" ");
		}
		
		
	}

}
