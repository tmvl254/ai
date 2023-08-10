package my.day05.exam2;

public class Computer extends Calculator {
	// 메소드 오버라이딩
	@Override
	public double areaCicle(double r) {
		System.out.println("Calculator 객체의 areaCicle() 실행");
		return Math.PI * r * r;
	}
}
