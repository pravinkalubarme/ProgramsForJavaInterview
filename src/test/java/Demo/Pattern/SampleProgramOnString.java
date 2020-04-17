package Demo.Pattern;

public class SampleProgramOnString {
	public static void main(String[] args) {
		toReverseTheNo(12345);
		toReverseTheNoUsingAnotherMethod(12345);
		seperateNoAndCharFromString("pravin123kalubarme456ywfiicsxguhjkzhvwaag12345678!@#$%^&*()dfghj#$%^&*(");
		toReverseTheString("India is the best country");
		toReverseEachWordInString("India is the best country");
		toReverseEvenWordInString("India is the best country");
		toFindLenghtOfEachWordOtherThanThe("India is the best country in the world all the facilities are good");
		repeatedLettersInString("abcdabcacdcdad");
		ToFindNumber3InSeriesUptoA(100);
	}

	public static void toReverseTheNo(int a) {
		System.out.println("Original no is: " + a);
		String rev = "";
		String oriNO = Integer.toString(a);
		for (int i = oriNO.length() - 1; i >= 0; i--) {
			rev = rev + oriNO.charAt(i);
		}
		int revNo = Integer.parseInt(rev);
		System.out.println("Reverse of number " + a + " is: " + revNo);
		if (a == revNo) {
			System.out.println("Given no is Palindrome");
		} else
			System.out.println("Given no is not Palindrome");
	}

	public static void toReverseTheNoUsingAnotherMethod(int a) {
		System.out.println("Original no is: " + a);
		int b = 0;
		for (int i = a; i > 0; i = i / 10) {
			b = b * 10 + (i % 10);
		}
		System.out.println("Reverse of number " + a + " is: " + b);
	}

	public static void seperateNoAndCharFromString(String str) {
		System.out.println("Given String is: " + str);
		String num = "";
		String chara = "";
		String special = "";

		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				chara = chara + str.charAt(i);
			} else if (Character.isDigit(str.charAt(i))) {
				num = num + str.charAt(i);
			} else
				special = special + str.charAt(i);
		}

		System.out.println("Char: " + chara);
		System.out.println("Num: " + num);
		System.out.println("Special: " + special);
	}

	public static void toReverseTheString(String s) {
		System.out.println("Given String is: " + s);
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}

	public static void toReverseEachWordInString(String s) {
		System.out.println("Given String is: " + s);
		String rev = "";
		String[] subStrings = s.split(" ");
		for (int i = 0; i < subStrings.length; i++) {
			for (int j = subStrings[i].length() - 1; j >= 0; j--) {
				rev = rev + subStrings[i].charAt(j);
			}
			rev = rev + " ";
		}
		System.out.println(rev + " ");
	}

	public static void toReverseEvenWordInString(String s) {
		System.out.println("Given String is: " + s);
		String[] sunStrings = s.split(" ");
		String rev = "";
		for (int i = 0; i < sunStrings.length; i++) {

			if (i % 2 == 0) {
				for (int j = sunStrings[i].length() - 1; j >= 0; j--) {
					rev = rev + sunStrings[i].charAt(j);
				}
				rev = rev + " ";
			} else
				rev = rev + sunStrings[i] + " ";
		}
		System.out.println(rev);
	}

	public static void toFindLenghtOfEachWordOtherThanThe(String s) {
		System.out.println("Given String is: " + s);
		String[] subStrings = s.split(" ");
		for (int j = 0; j < subStrings.length; j++) {
			if (!subStrings[j].equalsIgnoreCase("the")) {
				System.out.println("Lenght of the word \'" + subStrings[j] + "\' = " + subStrings[j].length());
			}
		}
	}

	public static void repeatedLettersInString(String s) {
		System.out.println("Given String is: " + s);
		int temp = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' && s.charAt(i + 1) == 'b') {
				temp = temp + 1;
			}
		}
		System.out.println(temp);
	}

	public static void ToFindNumber3InSeriesUptoA(int a) {
		System.out.println("Given series is from 0 to " + a);
		int temp = 0;
		for (int i = 1; i <= a; i++) {
			String no = Integer.toString(i);
			if (no.contains("3")) {
				temp = temp + 1;
				System.out.println("Number containing 3 is: " + no + " ");
			}
		}
		System.out.println();
		System.out.println("No of digits containing 3 =" + temp);
	}
}

