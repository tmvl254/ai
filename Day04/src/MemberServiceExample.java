class MemberService{
	
	//메소드 생성
	boolean login(String id, String password) {
		if(id.equals("hong")&& password.equals("12345")) {
			return true;			
		}else return false;			
	}
	
	void logout(String id) {
		if(id.equals("hong")) 
			System.out.println(id+"님이 로그아웃 되었습니다.");			
		else
			System.out.println("아아디를 재확인 해주시기 바랍니다.");			
	}
}

public class MemberServiceExample {
	
	public static void main(String[] args) {
		Member user1= new Member("오승주", "hong");
		MemberService memberService= new MemberService();
		boolean result= memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 하셨습니다.");	
			memberService.logout("hong");
		}else {
			System.out.println("로그인에 실패 하셨습니다.");	
			}
	}
}

class Member{
	String name;	//이름
	String id;		//아이디
	String password;		//패스워드
	int age;		//나이
	
	//인자 생성자 생성 
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
}















