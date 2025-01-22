package Java_Concepts;

public class IncrDemt {

	public static void main(String[] args) {
	
		int a =5;
		int b= a++ + ++a + a++;
		
		System.out.println(a+" "+b);
		
		int x =5, y=7;
		int z = ++x +--y - y-- + ++x + y++;
		
		System.out.println(x+" "+y+" "+z);
		
	}

}
