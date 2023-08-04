import java.util.Scanner;

public class Iftest3 {

	public static void main(String[] args) {
	
	//문제1 0부터 9사이의 정수를 입력받아 짝수홀수를 판단하시오
	//단 if문으로 작성하기
	int a;
	Scanner s = new Scanner(System.in);
	
	System.out.println("0~9까지의 숫자를 입력하세요");
	
	a = s.nextInt();
	
	if(a%2==0) {
		System.out.println("홀수");
	}
	else {
		System.out.println("짝수");
		}
	}

}
