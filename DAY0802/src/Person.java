
public class Person {
	String name;
	int age;
	
	public void eat(String sr) {
		System.out.println(sr+"을 먹는다.");
	}
	
	public void showIfo() {
	System.out.println("이름"+name);
	System.out.println("나이"+age);
	}

	public static void main(String[] args) {
		
		Person person = new Person();
		person.age = 20;
		person.name = "홍길동";
		person.showIfo();
		Person person2 = new Person();
		person2.age = 25;
		person2.name = "권길동";
		person2.showIfo();

	}

}
