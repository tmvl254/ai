package my.day05.exam4;

public class HumanTest {

	public static void main(String[] args) {
		
		Human sm = new Superman(); //자동 형변환 업캐스팅
		sm.name = "슈퍼맨";
		sm.height = 170;
		((Superman)sm).power = 50;	//강제 형변환 다운캐스팅
		String result = sm.getInfo();
		System.out.println("----슈퍼맨의 정보----");
		System.out.println(result);
		System.out.println("");

		Human aq = new Aquaman();
		aq.name = "아쿠아맨";
		aq.height = 180;
		((Aquaman)aq).speed = 150;
		String r = aq.getInfo();
		System.out.println("----아쿠아맨의 정보----");
		System.out.println(r);
	}

}
