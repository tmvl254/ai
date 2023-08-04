import java.util.Scanner;

public class Mathtest {

	public static void main(String[] args) {
		
//		int mx = Math.max(-5, -8);
//		
//		System.out.println("-8과 -5의 최댓값"+ mx);
//		
//		int mm = Math.min(-5, -8);
//		
//		System.out.println("-8과 -5의 최솟값"+ mm);
//		
//		double mx2 = Math.max(1.23, 3.45);
//		
//		System.out.println("1.23과 3.45의 최댓값"+ mx2);
//		System.out.println("5.67의 올림값"+ Math.ceil(5.67));
//		System.out.println("5.67의 내림값"+ Math.floor(5.67));
//		
//		//문제1 3의 7승의 값은?
//		double pw = Math.pow(3,7);
//		System.out.println("3의 7승: "+ pw);
//		
//		//문제2 64.0의 제곱근은?
//		double sq = Math.sqrt(64.0);
//		System.out.println("64.0의 제곱근: "+ sq);
		
//		int a = 0;
//		for(int i=1; i<=100; i++ ) {
//			if(i%3 == 0) {
//				a=a+i;
//			}
//		}
//	System.out.println(a);
		
//		for(int i=1; i<=5; i++ ) {
//			for(int a=1; a<=i; a++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//1부터 10까지 369출력하기 단 3,6,9일때 박수소리(짝)대신 출력하기			
//		for(int i=1; i<=10; i++ ) {
//			if(i%3 == 0) {
//				System.out.print("짝 ");
//			}
//			else {
//				System.out.print(i+" ");
//			}
//			
//		}
//		System.out.println();
//		
//		for(int a=1; a<=10; a++ ) {
//			if(a==3 || a==6|| a==9) {
//				System.out.print("짝 ");
//				continue;
//			}
//			System.out.printf("%d ",a);
//		}
		boolean s= true;
		int balance= 10000;
		
		while(s) {
		System.out.println("----------------------------------");
		System.out.println("1.예금 |2.출금 |3.잔고 |4.종료");
		System.out.println("----------------------------------");
		System.out.print("선택> ");
		
		Scanner a = new Scanner(System.in);
		int i = a.nextInt();
		
		switch (i) {
		 case 1:
			System.out.print("예금액: ");
			balance= balance+ a.nextInt();
			break;
		
		 case 2:
			System.out.print("출금액: ");
			balance= balance- a.nextInt();
			break;
		 
		 case 3:
			System.out.println("잔고: "+balance);
			break;
		 
		 case 4:
			System.out.println("종료");
			s = false;
			break;
			}
		}
	}

}
