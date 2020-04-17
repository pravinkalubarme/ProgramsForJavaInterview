package Demo.Pattern;

public class StringandSB {
	
	public static void main(String[] args) {
		
		String s1= new String("Durga");
		String s2= new String("Durga");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		StringBuffer sb1= new StringBuffer("Durga");
		StringBuffer sb2= new StringBuffer("Durga");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
	}

}
