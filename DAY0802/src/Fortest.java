
public class Fortest {

	public static void main(String[] args) {
		//1. 1부터 10까지의 합을 출력하시오. 출력은 결과만 
		//출력 결과: 1부터 10까지의 합: 55

//		int sum=0;
//		for(int i=1;i<=10;i++) {
//			sum= sum +i;
//		}
//		System.out.println("1부터 10까지의 합: "+sum);
		
		//2. 구구단 2단 출력
		//출력결과: 2x1=2
		//			2x2=4
		//			2x3=6
		//			....
		//			2x9=18		
//		int sum=0;
//		for(int i=1;i<=9;i++) {
//			sum=2*i;
//			System.out.println("2X"+i+"="+sum);
//		}
		//3.구구단
		for(int sum=1; sum<=9; sum++) {
		
			for(int i=1;i<=9;i++) {
			System.out.println(sum+"X"+i+"="+(sum*i));
			}
			System.out.println();
		}
	}
}