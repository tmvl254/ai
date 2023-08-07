import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {

		
		System.out.println("-----메뉴----");
		System.out.println("-----1.가정용 리터당 50원----");
		System.out.println("-----2.상업용 리터당 45원----");
		System.out.println("-----3.공업용 리터당 30원----");
		System.out.print("메뉴 선택후 사용량을 입력해 주세요: ");

		
		Scanner s = new Scanner(System.in);
		
		int a=0;	//종류
		int b=0;	//리터
		int c=0;	//사용요금=리터*가격
		double d=0;		//총수도요금 + 요금*0.05
		
		a= s.nextInt();
		
		System.out.println("=================================");
		System.out.print("사용량: ");
		
		b= s.nextInt();
		
		if(a==1) {
			System.out.println("사용자 코드: "+a);
			c= b*50;
			d=c+ c*0.05;
			System.out.println("사용요금:"+c);
			System.out.println("총수도요금:"+d);
		}
		
		else if(a==2) {
			System.out.println("사용자 코드: "+a);
			c= b*45;
			d=c+ c*0.05;
			System.out.println("사용요금:"+c);
			System.out.println("총수도요금:"+d);
		}

		else {
			System.out.println("사용자 코드: "+a);
			c= b*30;
			d=c+ c*0.05;
			System.out.println("사용요금:"+c);
			System.out.println("총수도요금:"+d);
		}
		
	}

}
