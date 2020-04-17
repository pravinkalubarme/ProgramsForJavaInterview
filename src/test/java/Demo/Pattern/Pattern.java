package Demo.Pattern;

public class Pattern {
	
	public static void main(String[] args) {
		System.out.println("Main");
		pattern1();
		pattern2();
		pattern3();
		pattern4();
		pattern5();
		pattern6();
	}
	
	public static void pattern1()
	{
		for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=3; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pattern2()
	{
		for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pattern3()
	{int sp=3;
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j<=sp; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
			sp--;
		}
	}

	public static void pattern4()
	{int sp=0;
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j<=sp; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
			sp++;
		}
	}
	
	
	public static void pattern5()
	{ int str=4;
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j<=str; j++) {
				System.out.print("* ");
			}
			str--;
			System.out.println();
		}
	}
	
	public static void pattern6()
	{ int Str=1;
		for (int i = 1; i <=7; i++) {
			for (int j = 1; j<=Str; j++) {
				System.out.print("* ");
			}
			System.out.println();
			if(i<4)
			     Str++;
			else
				Str--;
			
		}
	}
	
	
}
