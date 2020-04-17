package Demo.Pattern;

public class DemoCasting {
	public static void main(String[] args) {
		
	Son s= new Son();
	s.money();
	s.bike();
	s.car();
	
	Father s1= new Son();
		s1.car();
		s1.money();
	}
}
