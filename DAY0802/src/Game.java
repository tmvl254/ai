import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
	//가위바위보
		System.out.println("==Game Munu==");
		System.out.println("1. 가위\t2. 바위\t3. 보\t9.종료");
		System.out.println("==================");
		
		Scanner s = new Scanner(System.in);
		int user = s.nextInt();
		
		//컴퓨터 난수
		int com = (int)(Math.random()*3)+1;
		
		//승패판단
		System.out.println("나"+user);
		System.out.println("컴퓨터"+com);
	
		//내가 이길경우
		if(user==1 && com == 3 || user==2 && com == 1 || user==3 && com == 2) {
			System.out.println("이겼습니다.");
		}
		//내가 질경우
		else if(user==1 && com == 2 || user==2 && com == 3 || user==3 && com == 1) {
			System.out.println("졌습니다.");
		}
		//내가 비길경우
		else if((user==1 && com == 1 || user==2 && com == 2 || user==3 && com == 3)) {
			System.out.println("비겼습니다.");
		}
	}
}
