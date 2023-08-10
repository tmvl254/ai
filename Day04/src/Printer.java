
public class Printer {
	
	static void println(int a) {
		System.out.println(a);
	}
	
	static void println(boolean a) {
		System.out.println(a);
		
	}
	
	static void println(double a) {
		
		System.out.println(a);
	}
	
	static void  println(String a) {
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("오승주");
	}

}
