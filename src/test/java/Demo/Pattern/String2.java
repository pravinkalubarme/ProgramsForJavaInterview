package Demo.Pattern;

public class String2 {
	
	public static void main(String[] args) {
		//seperateNoAndCharFromString();
		//stringRepeatedPattern();
		seperateNoAndCharFromString();
	}

	public static void toReverseNo() {
		int oriNo = 12321;
		String oriString = Integer.toString(oriNo);
		System.out.println(oriString);
		String revString = "";

		for (int i = oriString.length() - 1; i >= 0; i--) {
			revString = revString + oriString.charAt(i);
		}
		System.out.println(revString);
		int revNo = Integer.parseInt(revString);
		System.out.println("revNo: " + revNo);

		if (oriNo == revNo) {
			System.out.println("No is Pallindrome");

		} else
			System.out.println("No is not pallindrome");
	}
	
	public static void seperateNoAndCharFromString() {
		String str = "pravin123kalubarme456ywfiicsxguhjkzhvwaag12345678!@#$%^&*()dfghj#$%^&*(";
		System.out.println("String: "+str);
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

		System.out.println("Char: "+chara);
		System.out.println("Num: "+num);
		System.out.println("Special: "+special);
	}

	
	public static void stringRepeatedPattern() {
		int temp = 0;
		String s1 = "aaabcaajbabbjkaxabajkl";
		for (int i = 0; i < s1.length() - 1; i++) {
			if (s1.charAt(i) == 'a' && s1.charAt(i + 1) == 'b') {
				temp = temp + 1;
			}
		}
		System.out.println(temp);
	}

}
