package my.day05.exam7;

import java.util.Scanner;

public abstract class Person {
	private String name; // 이름
	private String id; // 아이디

	// 추상메소드
	public abstract String getId();

	public abstract void setId(String Id);

	// 기본 생성자
	public Person() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}

	/** 사람의 정보를 입력받는 모듈 */
	public void inputInfo() {
		System.out.println("이름을 입력하세요");
		Scanner s = new Scanner(System.in);
		String nm = s.next();
		name = nm;
	}

	/** 사람의 정보를 문자열로 반환해주는 메소드 */
	public String personInfo() {
		String info = "이름:" + name;
		return info;
	}

	/** 사람의 정보를 출력해주는 메소드 */
	public void printAll() {
		System.out.println(this.personInfo());
	}

	public String toString() {
		return name;

	}

}
