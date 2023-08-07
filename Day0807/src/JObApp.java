import java.util.ArrayList;
import java.util.Scanner;

public class JObApp {
	
	//속성
	public JObApp() {
		
	}
	
	//메뉴 메소드(반환타입과 매개변수 모두 없는 메소드 타입)
	public void showMeny() {
		System.out.println("1.구직등록");
		System.out.println("2.구인등록");
		System.out.println("3.구직자 정보 출력");
		System.out.println("4.구인회사 정보 출력");
		System.out.println("5.종료");
		System.out.println("메뉴번호를 입력하세요");
	}
	
	//사람의 정보 입력받는 메소드 (반환타입 없음 매개변수 없음)
	
	public void inputPerson() {
		Scanner s=new Scanner(System.in);
		//이름,나이,성별,전화번호를 입력받아
		
		System.out.println("이름입력: ");
		String name= s.next();
		
		System.out.println("나이입력: ");
		int age= s.nextInt();
		
		System.out.println("성별메뉴");
		System.out.println("1.남자 2.여자");
		char sex;
		int n= s.nextInt();
		if(n==1) {
			sex= 'M';
		}else {
			sex= 'F';	
		}
		
		System.out.println("전화번호입력: ");
		String tel= s.next();
		
		/////////////////////////////////////////////
		Person person = new Person(name,age,sex,tel);
		/////////////////////////////////////////////
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(person);
	
	
		// 메소드 내에서 메소드호출
		String result =person.showProfile();
		System.out.println(result);

	}
	//3. 구직자 정보 출력메소드 반환타입:문자열 매개변수값 없음

	public static void main(String[] args) {
		JObApp jap = new JObApp();
		while(true) {
		jap.showMeny();
		
		Scanner s=new Scanner(System.in);
		
		int num =s.nextInt();
		
		if(num==5) {
			System.out.println("정상종료");
			System.exit(0);
		}else if(num==1) {
			jap.inputPerson();
			} 
		else if(num==3) {
		} 

		}
	}
	

}
