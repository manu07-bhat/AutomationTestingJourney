import java.util.Iterator;

public class Corejavabaiscs_3 {

	public static void main(String[] args) {
		// String concepts

		// String as an object & String as Literal
		String s1 = "manoj ";

		// if the string value is same then the java won't create extra space it will
		// re-direct to s1

		// String is an object represent the sequences of characters 

		// New
		// it will create new object in memory space
//		String s3 = new String("ganga");
//		String s4 = new String("ganga");
//
//		String s2 = "manoj hhh ooo";
//		String[] h = s2.split("hhh");
//
//		System.err.println(h[0]);
//		System.err.println(h[1]);
//		System.out.println(h[0].trim());
//
//		for (int i = 0; i < h.length; i++) {
//			System.out.println(h[i]);
//		}
//
//		for (int i = 0; i < s2.length(); i++) {
//			System.out.println(s2.charAt(i));
//		}

		String j = "rehcaeT";
		String j1 = "";

		for (int i = j.length() - 1; i >= 0; i--) {

			j1 = j1 + j.charAt(i);

		}
		System.out.println(j1);
	}

}
