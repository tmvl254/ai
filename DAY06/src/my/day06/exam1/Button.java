package my.day06.exam1;

public class Button {

	// 중첩 인터페이스
	static interface ClickListener {

		// 추상 메소드
		void onClick();
	}

	// 필드선언
	ClickListener clicklistener;

	// 필드 초기화
	void setClickListener(ClickListener clicklistener) {
		this.clicklistener = clicklistener;
	}

	void click() {
		this.clicklistener.onClick();
	}
}