package Demo.Pattern;

public class SpecialClass {
	public static void main(String[] args) {
		pattern2();
	}
	
	public static void pattern1() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}	
	}
	
	public static void pattern2() {
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j <=i; j++) {
				
				System.out.print(i+" ");

			}
			System.out.println();
		}
	}

}
