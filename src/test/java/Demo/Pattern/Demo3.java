package Demo.Pattern;

public class Demo3 {
	public static void main(String[] args) {
		
	methodA(2,"aaa");
	}
	
	public static void methodA(String a, int b) {
		System.out.println("String, int");
	}
	
	public static void methodA(int b, String a) {
		System.out.println("Int String");
	}
}
