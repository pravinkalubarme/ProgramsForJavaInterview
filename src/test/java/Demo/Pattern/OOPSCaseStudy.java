package Demo.Pattern;

public class OOPSCaseStudy {
	public static void main(String[] args) {
		OOPSCaseStudy t= new OOPSCaseStudy();
		t.m(10);
		t.m('a');
		t.m(10.5f);
		t.m(new Object());
		t.m("Pravin");
		t.m(new StringBuffer("Prain"));
		t.m();	
	}

	public static void m(int a, float f) {
		System.out.println(" Int float version");
	}
	public static void m(int... a) {
		System.out.println("Var Int version");
	}
	public static void m(float a, int b) {
		System.out.println("Float int version");
	}
	public static void m(Object a) {
		System.out.println("Object version");
	}
	public static void m(String a) {
		System.out.println("String version");
	}
	public static void m(StringBuffer a) {
		System.out.println("StringBuffer version");
	}
}
