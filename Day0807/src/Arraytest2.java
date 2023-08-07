
public class Arraytest2 {

	public static void main(String[] args) {
		
		//문자열 3개의 값을 저장하는 배열생성
//		String[] foods= {"계란찜","돈가스","된장찌개"}; 
//		
//		String[] foods2= null;
//		foods2= new String[] {"도시락","국수","수프"};
		
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println(num1 + "*" + num2 + "= " + (num1 * num2));
	}

}
