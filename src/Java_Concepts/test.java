package Java_Concepts;

import java.util.ArrayList;

interface demo {

	public abstract void method_1();

}

public class test implements demo {

	void method_3() {
		int a = 10;
	}

	public void method_1() {

	}

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list1.add(1);
		list1.add(2);
		list1.add(3);

		System.out.println(list1);

		list2.add(4);
		list2.add(5);
		list2.add(8);

		System.out.println(list2);
		list1.addAll(list2);

		System.out.println(list1);

//		list1.clear();
		System.out.println(list1);

		System.out.println(list1.size());

		// convert list1 to array and print the array
		Object[] arr = list1.toArray();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
