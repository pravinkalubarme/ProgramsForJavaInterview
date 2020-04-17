package Demo.Pattern;

public class PatternProgramsRelatedToNumbers {

	public static void main(String[] args) {
		evenOdd(252);
		primeOrNot(6);
		factorial(3);
		fibbonacci(10);
		noInADigit();
	}

	public static void evenOdd(int a) {
		if (a % 2 == 0) {
			System.out.println(a + " is Even No.");
		} else
			System.out.println(a + " is odd No.");
	}

	public static void primeOrNot(int no) {
		int temp = 0;
		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				temp++;
			}
		}
		if (temp == 0) {
			System.out.println(no + " is prime no ");
		} else
			System.out.println(no + " is not prime");
	}

	public static void factorial(int a) {
		int fact = 1;
		for (int i = a; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + a + " is= " + fact);
	}

	public static void fibbonacci(int a) {
		int FN = 0;
		int SN = 1;
		System.out.print(FN + " ");
		System.out.print(SN + " ");
		for (int i = 0; i < (a - 2); i++) {
			int TN = FN + SN;
			System.out.print(TN + " ");
			FN = SN;
			SN = TN;
		}
	}
	public static void noInADigit() {
	int temp=0;
	System.out.println();
		for (int i = 1; i<=100; i++) {
			String number = Integer.toString(i);
			if (number.contains("3")) {
				temp++;
				System.out.print(i+" ");
			}
		}
		System.out.println("\nNo 3 is present "+temp+" times in given series");
	}
	
	
}
