package Demo.Pattern;

public class ToFindNoInSeries {

	public static void main(String[] args) {

		int temp=0;
		for (int i = 1; i <=1000; i++) 
		{
			String no = Integer.toString(i);
			if (no.contains("3"))
			{
				temp=temp+1;
				System.out.print(no+" ");
			}
		}
		System.out.println();
		System.out.println("NO of digits containing de="+temp);
	}
}
