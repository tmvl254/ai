import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
	/*
		String name;
		int age;
		String dept;
		double height;
		
		//입렦객체 생성
		
		Scanner scan = new Scanner(System.in);

		//데이터 읽어오기
		
		System.out.print("이름을 입력하세요: ");
		
		name = scan.next();
		
		System.out.print("나이을 입력하세요: ");
		
		age = scan.nextInt();
		
		System.out.print("키를 입력하세요: ");
		
		height = scan.nextDouble();
		
		System.out.print("전공를 입력하세요: ");
		
		dept = scan.next();
		
		//printf 메소드를 이용하여 자신의 정보를 출력해 보세요.
		System.out.printf("이름:%s, 나이:%d, 키:%5.1f, 전공:%s", name, age, height, dept);
		*/
		
		int midScore;
		int finaScore;
		double 평균;
		
		Scanner scan = new Scanner(System.in);	
		System.out.print("중간점수를 입력하세요: ");
		
		midScore = scan.nextInt();
		
		System.out.print("기말점수를 입력하세요: ");
		
		finaScore = scan.nextInt();
		
		평균 = (double) (midScore + finaScore) /2;
		
		System.out.println("중간고사 점수: " + midScore);
		System.out.println("기말고사 점수: " + finaScore);
		System.out.println("평균: " + 평균);
		
	}

}
