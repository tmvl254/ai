package my.day05.exam4;

public class Superman extends Human {
	int power; // 초능력

	// 메소드 오러라이딩
	@Override
	public String getInfo() {
		String str = super.getInfo();
		str +="\n초능력:"+power;
		return str;
	}
}
