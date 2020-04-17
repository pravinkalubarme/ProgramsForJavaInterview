package Demo.Pattern;

public class StringPrograms {

	public static void main(String[] args) {
		toReverseString();
		toReverseEachWordInString();
		toReverseEvenWordInString();
	}

	public static void toReverseString() {
		String oriString = "Geetanjali Pravin Kalubarme";
		System.out.println(oriString);
		String revString = "";

		for (int i = oriString.length() - 1; i >= 0; i--) {
			revString = revString + oriString.charAt(i);
		}
		System.out.println(revString);
	}
	
	public static void toReverseEachWordInString() {
		String s1 = "Sagar Sugriv Dadhe";
		String[] subString = s1.split(" ");
		for (int i = 0; i < subString.length; i++) {
			String oriString = subString[i];
			String revString = "";
			for (int j = oriString.length() - 1; j >= 0; j--) {
				revString = revString + oriString.charAt(j);
			}
			System.out.print(revString + " ");
		}
	}
//Result: ragaS virguS ehdaD
	
	public static void toReverseEvenWordInString() {
		String s1 = "Sagar Sugriv Dadhe";
		System.out.println();
		String[] subString = s1.split(" ");
		for (int i = 0; i < subString.length; i++) {
			if (i % 2 == 1) {
				String oriString = subString[i];
				String revString = "";
				for (int j = oriString.length() - 1; j >= 0; j--) {
					revString = revString + oriString.charAt(j);
				}
				System.out.print(revString + "  ");
			} else {
				System.out.print(subString[i] + " ");
			}
		}
	}
	//Result: Sagar virguS Dadhe
	
}
