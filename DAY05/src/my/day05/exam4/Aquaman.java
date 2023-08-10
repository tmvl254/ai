package my.day05.exam4;

public class Aquaman extends Human {
	int speed; // 속도

	// 메소드 오러라이딩
	@Override
	public String getInfo() {
		String str = super.getInfo();
		str += "\n스피드:" + speed;
		return str;
	}

	// 메소드 오버로딩
	public String getInfo(int speed) {
		return super.getInfo() + "\n스피드:" + speed;

	}
}
