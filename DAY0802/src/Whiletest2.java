public class Whiletest2  {

	public static void main(String[] args) throws Exception{
//		String str = "";
//		Scanner s = new Scanner(System.in);
//		while(true) {
//			str =s.next();
//			if (str.equals("x")|| str.equals("X"))
//				break;
//		}
//		System.out.println("end");
		
		
		boolean bool= false;
		double sum= 0.0;
		while(!bool) {
			double no = Math.random();
			sum+=no;
			Thread.sleep(2000);
			System.out.println("sum"+ sum);
			if(sum>20) break;
		}
	}
}
