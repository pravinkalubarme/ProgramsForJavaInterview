package Demo.Pattern;

public class SampleProgramOnString {
	public static void main(String[] args) {
		//toReverseTheString("Pravin Kalubarme");
		//toReverseTheNo();
		//toReverseTheNoUsingAnotherMethod();
		toSeperateNoDigitsAndSpecialChar("#pravin kalubarme11#50!@gmail.com");
	}

	public static void toReverseTheString(String s) {
		String rev="";
		for (int i = s.length()-1; i >=0 ; i--) {
			rev= rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	
	public static void toReverseTheNo() {
		int n=12321;
		String rev="";
		String oriNO=Integer.toString(n);
		for (int i = oriNO.length()-1; i >=0 ; i--) {
			rev= rev+oriNO.charAt(i);
		}
		int revNo=Integer.parseInt(rev);System.out.println(revNo);
		if (n==revNo) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
	}
	
	public static void toReverseTheNoUsingAnotherMethod() {
		int a=126569;
		int b=0;
		for (int i = a; i > 0; i=i/10) {
			b=b*10+(i%10);
		}
		System.out.println(b);
	}
	
	public static void toSeperateNoDigitsAndSpecialChar(String s) {
		String no="";
		String special="";
		String characters="";
		
		for (int i = 0; i<=s.length()-1; i++) {
			if(Character.isDigit(s.charAt(i))) {
			no=no+s.charAt(i);
			}
			else if (Character.isAlphabetic(s.charAt(i))) {
				characters=characters+s.charAt(i);
				}
			else
				special=special+s.charAt(i);
		}
		System.out.println(no);
		System.out.println(special);
		System.out.println(characters);
	}
}