package my.day05.exam1.copy;

public class SmartPhone extends Phone {
	// 필드 선언
	public boolean wifi;
	
	// 자식생성자 선언
	public SmartPhone(String tel, String model, String color) {
		super(tel, model, color);
	}

	public void SetWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}

	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}

}
