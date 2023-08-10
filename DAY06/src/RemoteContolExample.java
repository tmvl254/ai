
public class RemoteContolExample {

	public static void main(String[] args) {

		// 인터페이스 변수선언
		RemoteContol rc = null;
		RemoteContol au = null;

		// Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();

		rc.turnOn();
		rc.setMute(true);
		rc.setVolume(5);
		rc.setMute(false);
		rc.turnOff();
		RemoteContol.ChangeBettery();

		au = new Audio();
		au.turnOn();
		au.setVolume(7);
		au.turnOff();

		au.turnOn();
		au.setVolume(14);
	}

}
