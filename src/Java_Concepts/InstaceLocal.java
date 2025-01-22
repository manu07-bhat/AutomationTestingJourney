package Java_Concepts;

public class InstaceLocal {

	int a;
	byte b;
	
	void jack() {
		int c;
		float a;
		
		System.out.println(a=1);
	}
	public static void main(String[] args) {
		InstaceLocal obj = new InstaceLocal();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.jack();
		
	}

}
