
public class Person {

	String name;
	int age;
	char sex;
	String tel;
	//생성자
	//객체생성 이 호출
	//1.반드시 public 접근자
	//2.변환타입없다.
	//3.클래스 이름과 동일하다.
	public Person() {//기본 생성자
		
	}
	
	public Person(String name, char sex, String tel) {
		this(name, 20, sex,tel);
		
	}
	
	//인자 생성자
	public Person(String name, int age, char sex, String tel) {
		this.name= name;
		this.age= age;
		this.sex= sex;
		this.tel= tel;
	}
	
	//반환타입이 문자열이고 배개변수가 없는 메소드
	public String showProfile() {
		String info="----"+name+"프로필------";
		info+="\n나이: " +age;
		info+="\n성별: " +sex;
		info+="\n전화: " +tel;
		return info; //문자열 반환
	}//showProfile()--------
	
	public void wantJob(String job, int pay) {
		System.out.println("----"+name+"----");
		System.out.println("희망직종"+job);
		System.out.println("희망연봉"+pay);
	}//wantjob()------
	
	
	
	//동작 메소드
	 public void eat() {
		 System.out.println("먹다");
	 }
	 
	 public void smile() {
		 System.out.println("웃다");
	 }
}
