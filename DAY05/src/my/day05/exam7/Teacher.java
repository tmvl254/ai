package my.day05.exam7;

import java.util.Scanner;

public class Teacher extends Person {

	private String tID; // 교번
	private String subject;// 과목

	public String personInfo() {
		String info = super.personInfo();
		info += "\n교번:" + tID + "\n과목:" + subject;
		return info;
	}

	@Override
	public String getId() {
		return tID;
	}

	@Override
	public void setId(String Id) {
		this.tID = Id;

	}

	public void settID(String tID) {
		this.tID = tID;

	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	// inputInfo() 메소드 오버라이딩
	public void inputInfo() {
		///////////////////
		super.inputInfo();
		///////////////////
		System.out.println("교번을 입력하세요=");
		Scanner s = new Scanner(System.in);
		String sid = s.next();
		setId(sid);// 맴버변수에 입력값 저장

		System.out.println("과목을 입력하세요=");
		Scanner sc = new Scanner(System.in);
		String cn = sc.next();
		setSubject(cn);// 맴버변수에 입력값 저장
	}

}
