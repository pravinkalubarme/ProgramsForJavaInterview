package Demo.Pattern;

public class Overloading {
	
	public static void methodA(int... a)
	{
		System.out.println("Method A");
	}
	
	public static void methodA(int a)
	{
		System.out.println("Method B");
	}
	
public static void main(String[] args) {

		methodA();
}} 