package my.day05;

public class Human {
	private String name;
	private int age;
	private String addr;

	// 기본 생성자 선언
	public Human() {

	}

	// 인자 생성자 선언
	public Human(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public Human(String name, int age) {
		this(name, age, "세종");

	}

	// getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddr() {
		return addr;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

}
