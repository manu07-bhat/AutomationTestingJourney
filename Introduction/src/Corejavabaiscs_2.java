import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Corejavabaiscs_2 {

	public static void main(String[] args) {
		// Array and ArrayList concepts
//		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 122 };
//
//		// check the array is multiple of 2 or not
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 0) {
//				System.out.println(arr[i]);
//			} else {
//				System.out.println("not a multiple of 2");
//			}
//		}

//		int[] numbers = { 1, 2, 3, 4, 5 };

//	        System.out.println(numbers[4]);
//	        System.out.println(numbers[0]+"-------------"); 
//	        
//	        for (int i=numbers.length-1;i>=0; i--)
//	        {
//	            System.out.println(numbers[i]);
//	        }
//		int temp = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			temp = temp + numbers[i];
//
//		}
//		System.out.println(temp);

		// ArrayList

		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("ganga");
		a.add("shivu");
		a.get(2);
		System.out.println(a.get(2));
		System.err.println(a.contains("ganga"));

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("---------------------");
		for (String val : a) {
			System.out.println(val);
		}

		String s1[] = { "ganga", "manga", "tunga" };
		List<String> num = Arrays.asList(s1);
		System.err.println(num.contains("tunga"));
	}

}
