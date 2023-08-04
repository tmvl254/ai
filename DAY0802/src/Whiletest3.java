import java.util.Scanner;

public class Whiletest3 {

	public static void main(String[] args) {
		String str = "";
		Scanner s = new Scanner(System.in);
		while(true) {
			str =s.next();
			if (str.equals("x")|| str.equals("X"))
				break;
		}
		System.out.println("end");
	}
	

}
