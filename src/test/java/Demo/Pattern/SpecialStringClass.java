package Demo.Pattern;

public class SpecialStringClass {

	public static void main(String[] args) {
		// toReverseTheString("Pravin Kalubarme");
		// toReverseEachWordInString("Pravin Kalubarme Machnur Mangalwedha");
		// toReverseEvenWordInString("Pravin Kalubarme Machnur Mangalwedha");
		// toFindSizeOfEachWord();
		repeatedLettersInString();
	}

	public static void toReverseTheString(String s) {
		System.out.println("Original String is: " + s);
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("Reverse String is: " + rev);
	}

	public static void toReverseEachWordInString(String s) {
		System.out.println("Original String is: " + s);
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
		System.out.println("Original String is: " + s);
		String[] sunStrings = s.split(" ");
		System.out.println(sunStrings.length);
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

	public static void toFindSizeOfEachWord() {
		String s = "India is the best country in the world all the facilities are good";
		String[] subStrings = s.split(" ");
		for (int j = 0; j < subStrings.length; j++) {
			if (!subStrings[j].equalsIgnoreCase("the")) {
				System.out.println(subStrings[j]);
			}
		}
	}

	public static void repeatedLettersInString() {
		String s = "abcdabcacdcdad";
		int temp = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' && s.charAt(i + 1) == 'b') {
				temp = temp + 1;
			}
		}
		System.out.println(temp);
	}
}
