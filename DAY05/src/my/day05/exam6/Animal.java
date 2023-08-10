package my.day05.exam6;

public abstract class Animal {
	//추상클래스 객체를 생성할수 없다. new 사용불가
	//적어도 1개의 추상 메소드를 포함해야한다.
	
	String name;
	 
	abstract void sound();
	
	public String getname() {
		return name;
	}
}
