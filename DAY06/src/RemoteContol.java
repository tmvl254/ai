
public interface RemoteContol {
	// 구성요소: 상수필드, 추상메소드

//	static final double PI= 3.14159;

	// 상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 추상 메소드
	void turnOn();

	void turnOff();

	void setVolume(int volume);

	// 디폴트 인스턴스 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
			// 추상메소드를 호출하며 상수필드사용
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");

		}
	}
	
	//  static 정적메소드 구현객체 없이 호출가능
	static void ChangeBettery() {
		System.out.println("리모컨 건전지를 교체합니다.");
	}
}
