package my.day05.exam1.copy;


public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myphone = new SmartPhone("010-4566-4212", "갤럭시", "금색");

		System.out.println("전화번호=" + myphone.tel);
		System.out.println("기종=" + myphone.model);
		System.out.println("색깔=" + myphone.color);

		System.out.println("와이파이 상태=" + myphone.wifi);

		myphone.bell();
		myphone.sendvoice("안녕하세요");
		myphone.receivevoice("반갑습니다");
		myphone.sendvoice("네 반갑습니다.");
		myphone.hangup();

		myphone.SetWifi(true);
		myphone.internet();
	}

}
