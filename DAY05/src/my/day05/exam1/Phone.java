package my.day05.exam1;

public class Phone {
	public String tel; // 전화번호
	public  String model; // 기종
	public  String color; // 색깔

	// 메소드 선언
	public void bell() {
		System.out.println("벨이 울립니다.");
	}

	public void sendvoice(String messae) {
		System.out.println("자기" + messae);

	}

	public void receivevoice(String messae) {
		System.out.println("상대방" + messae);

	}

	public void hangup() {
		System.out.println("전화를 종료합니다.");

	}

}
