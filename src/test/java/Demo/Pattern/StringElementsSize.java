package Demo.Pattern;

public class StringElementsSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "Hello I am the Pravin and he married to Geeta";
		
		String[] subStri = s.split(" ");
		//System.out.println(subStri.length);
		
		for (int i = 0; i < subStri.length; i++) {
			if (!subStri[i].equals("the")) {
				System.out.println("String is: "+subStri[i]+" and its lenght is="+subStri[i].length());
			}
		}
	}
}
