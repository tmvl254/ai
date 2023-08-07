
public class Car {

	int speed=10;
	String color="빨강";
	
	//생성자
	public Car() {//기본 생성자
		//객체 생성시 호출
		//맴버변수의 초기화
		speed = 10;
		color = "빨강";
	}
	
	public Car(int speed) {
		this(speed,"노랑");
	}
	
	//생성자 중복정의
	//이름은 같고 매개변수의 갯수, 종류가 다르다.
	public Car(int speed, String color) {
		this.speed = speed;
		this.color = color;
	}
	
	//매소드
	public void run(int s) {
		s += speed;
		System.out.println(this.speed + "속도를 올린다.");
	}

	public void stop(int s) {
		s-=speed;	
		if(speed==0) speed =10;
		System.out.println(this.speed + "속도를 멈춘다.");
	}
}
